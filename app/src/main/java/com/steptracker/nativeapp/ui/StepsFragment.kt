package com.steptracker.nativeapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.ValueFormatter
import com.steptracker.nativeapp.R
import com.steptracker.nativeapp.data.DailyData
import com.steptracker.nativeapp.data.DataRepository
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class StepsFragment : Fragment() {
    private lateinit var viewModel: StepsViewModel
    private lateinit var pieChart: PieChart
    private lateinit var weightChart: LineChart
    private lateinit var tvSteps: TextView
    private lateinit var tvGoal: TextView
    private lateinit var tvProgress: TextView
    private lateinit var tvTime: TextView
    private lateinit var tvKcal: TextView
    private lateinit var tvKm: TextView
    private lateinit var tvActiveMin: TextView
    private lateinit var rvWeekly: RecyclerView
    private lateinit var rvRecentActivity: RecyclerView
    
    private lateinit var activityRepository: DataRepository
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repo = DataRepository(requireContext())
        viewModel = ViewModelProvider(this, StepsViewModel.Factory(repo))[StepsViewModel::class.java]
    }
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_steps, container, false)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        pieChart = view.findViewById(R.id.pieChart)
        weightChart = view.findViewById(R.id.weightChart)
        tvSteps = view.findViewById(R.id.tvSteps)
        tvGoal = view.findViewById(R.id.tvGoal)
        tvProgress = view.findViewById(R.id.tvProgress)
        tvTime = view.findViewById(R.id.tvTime)
        tvKcal = view.findViewById(R.id.tvKcal)
        tvKm = view.findViewById(R.id.tvKm)
        tvActiveMin = view.findViewById(R.id.tvActiveMin)
        rvWeekly = view.findViewById(R.id.rvWeekly)
        rvRecentActivity = view.findViewById(R.id.rvRecentActivity)
        
        activityRepository = DataRepository(requireContext())
        
        setupCharts()
        setupRecyclerView()
        setupRecentActivityRecyclerView()
        
        view.findViewById<View>(R.id.btnSettings).setOnClickListener {
            startActivity(Intent(requireContext(), SettingsActivity::class.java))
        }
        
        view.findViewById<View>(R.id.btnViewDetail).setOnClickListener {
            startActivity(Intent(requireContext(), ActivityDetailActivity::class.java))
        }
        
        observeData()
    }
    
    private fun setupRecentActivityRecyclerView() {
        rvRecentActivity.layoutManager = LinearLayoutManager(requireContext())
        
        lifecycleScope.launch {
            activityRepository.getActivities().collect { activities ->
                rvRecentActivity.adapter = RecentActivityAdapter(
                    activities = activities.take(3),
                    onItemClick = { activityId ->
                        ActivityDetailBottomSheet.newInstance(activityId)
                            .show(childFragmentManager, "activity_detail")
                    }
                )
            }
        }
    }
    
    private fun setupCharts() {
        pieChart.apply {
            description.isEnabled = false
            legend.isEnabled = false
            isDrawHoleEnabled = true
            holeRadius = 70f
            transparentCircleRadius = 75f
            setHoleColor(android.R.color.transparent)
            setDrawEntryLabels(false)
        }
        
        weightChart.apply {
            description.isEnabled = false
            legend.isEnabled = false
            xAxis.apply {
                position = com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM
                setDrawGridLines(false)
            }
            axisLeft.apply {
                setDrawGridLines(true)
                setDrawLabels(false)
            }
            axisRight.isEnabled = false
        }
    }
    
    private fun setupRecyclerView() {
        rvWeekly.layoutManager = LinearLayoutManager(requireContext())
    }
    
    private fun observeData() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.todayData.collectLatest { list ->
                        updateUI(list.firstOrNull())
                    }
                }
                
                launch {
                    viewModel.weeklyData.collectLatest { weeklyData ->
                        updateWeeklyChart(weeklyData)
                    }
                }
            }
        }
    }
    
    private fun updateUI(data: DailyData?) {
        data?.let {
            val steps = it.currentSteps
            val goal = it.dailyGoal
            val progress = (steps.toFloat() / goal * 100).coerceAtMost(100f)
            
            tvSteps.text = steps.toString()
            tvGoal.text = "/ $goal"
            tvProgress.text = "${progress.toInt()}% of daily goal"
            
            tvTime.text = "${it.activeMinutes}m"
            tvKcal.text = it.kcal.toString()
            tvKm.text = String.format("%.1f", it.km)
            tvActiveMin.text = it.activeMinutes.toString()
            
            updatePieChart(steps, goal - steps)
        }
    }
    
    private fun updatePieChart(completed: Int, remaining: Int) {
        val entries = listOf(
            PieEntry(completed.toFloat(), "Completed"),
            PieEntry(remaining.coerceAtLeast(0).toFloat(), "Remaining")
        )
        
        val colors = listOf(
            androidx.core.content.ContextCompat.getColor(requireContext(), R.color.emerald_500),
            androidx.core.content.ContextCompat.getColor(requireContext(), R.color.gray_200)
        )
        
        val dataSet = PieDataSet(entries, "").apply {
            this.colors = colors
            setDrawValues(false)
        }
        
        pieChart.data = PieData(dataSet)
        pieChart.invalidate()
    }
    
    private fun updateWeeklyChart(weeklyData: List<DailyData>) {
        // Update weekly progress bars
        rvWeekly.adapter = WeeklyGoalsAdapter(weeklyData)
        
        // Update weight chart
        if (weeklyData.isNotEmpty()) {
            val entries = weeklyData.mapIndexed { index, data ->
                Entry(index.toFloat(), data.weight.toFloat())
            }
            
            val dataSet = LineDataSet(entries, "Weight").apply {
                color = androidx.core.content.ContextCompat.getColor(requireContext(), R.color.emerald_500)
                setDrawCircles(true)
                setDrawValues(false)
                lineWidth = 2f
            }
            
            weightChart.data = LineData(dataSet)
            weightChart.invalidate()
        }
    }
}

class WeeklyGoalsAdapter(private val data: List<DailyData>) : 
    RecyclerView.Adapter<WeeklyGoalsAdapter.ViewHolder>() {
    
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvDay: TextView = view.findViewById(R.id.tvDay)
        val progressBar: android.widget.ProgressBar = view.findViewById(R.id.progressBar)
        val tvSteps: TextView = view.findViewById(R.id.tvSteps)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_daily_goal, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.tvDay.text = item.date.dayOfWeek.name.take(3)
        holder.progressBar.progress = (item.currentSteps.toFloat() / item.dailyGoal * 100).toInt()
        holder.tvSteps.text = item.currentSteps.toString()
    }
    
    override fun getItemCount() = data.size.coerceAtMost(7)
}

class RecentActivityAdapter(
    private val activities: List<com.steptracker.nativeapp.data.ActivityRecord>,
    private val onItemClick: ((Long) -> Unit)? = null
) : RecyclerView.Adapter<RecentActivityAdapter.ViewHolder>() {
    
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivActivityIcon: ImageView = view.findViewById(R.id.ivActivityIcon)
        val tvActivityType: TextView = view.findViewById(R.id.tvActivityType)
        val tvActivityDate: TextView = view.findViewById(R.id.tvActivityDate)
        val tvActivitySteps: TextView = view.findViewById(R.id.tvActivitySteps)
        val tvActivityCalories: TextView = view.findViewById(R.id.tvActivityCalories)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_activity, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val context = holder.itemView.context
        val activity = activities[position]
        holder.tvActivityType.text = activity.type.replaceFirstChar { it.uppercase() }
        holder.tvActivityDate.text = "${activity.date}, ${activity.startTime?.toLocalTime()}"
        holder.tvActivitySteps.text = context.getString(R.string.steps_format, activity.steps)
        holder.tvActivityCalories.text = context.getString(R.string.kcal_km_format, activity.kcal, activity.km)
        
        // Click to view detail - pass activity ID
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(activity.id)
        }
    }
    
    override fun getItemCount() = activities.size
}
