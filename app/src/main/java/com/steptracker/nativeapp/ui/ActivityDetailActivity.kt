package com.steptracker.nativeapp.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.steptracker.nativeapp.R
import com.steptracker.nativeapp.data.DataRepository
import com.nphlab.sdk.ads.NphAds
import com.nphlab.sdk.ads.listener.NphAdListener
import com.nphlab.sdk.ads.AdError
import kotlinx.coroutines.launch

class ActivityDetailActivity : AppCompatActivity() {
    private lateinit var repository: DataRepository
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        
        repository = DataRepository(this)
        
        findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)?.let {
            setSupportActionBar(it)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        
        loadActivityDetails()
    }
    
    private fun loadActivityDetails() {
        lifecycleScope.launch {
            // Load latest activity or get from intent
            val activityId = intent.getLongExtra("activity_id", -1)
            
            if (activityId > 0) {
                val activity = repository.getActivity(activityId)
                activity?.let { displayActivity(it) }
            } else {
                // Get most recent activity
                val activities = repository.getActivitiesSync()
                activities.firstOrNull()?.let { displayActivity(it) }
            }
        }
    }
    
    private fun displayActivity(activity: com.steptracker.nativeapp.data.ActivityRecord) {
        // Duration
        val durationText = activity.durationMinutes?.let { 
            val hours = it / 60
            val mins = it % 60
            if (hours > 0) String.format("%d:%02d:%02d", hours, mins, 0) 
            else String.format("%02d:%02d", mins, 0)
        } ?: "0:00"
        findViewById<TextView>(R.id.tvDuration).text = durationText
        
        // Steps
        findViewById<TextView>(R.id.tvTotalSteps).text = activity.steps.toString()
        
        // Calories
        findViewById<TextView>(R.id.tvCalories).text = activity.kcal.toString()
        
        // Timeline
        findViewById<TextView>(R.id.tvStartTime).text = activity.startTime?.toLocalTime()?.toString() ?: "--"
        findViewById<TextView>(R.id.tvEndTime).text = activity.endTime?.toLocalTime()?.toString() ?: "--"
        findViewById<TextView>(R.id.tvStartLocation).text = "Start Point"
        findViewById<TextView>(R.id.tvEndLocation).text = "End Point"
        
        // Speed
        findViewById<TextView>(R.id.tvHighestSpeed).text = String.format("%.1f km/h", activity.highestSpeed)
        findViewById<TextView>(R.id.tvAverageSpeed).text = String.format("%.1f km/h", activity.averageSpeed)
    }
    
    override fun onSupportNavigateUp(): Boolean {
        NphAds.showInterstitial(
            activity = this,
            nameSpace = "nsp_inter_activity_detail",
            listener = object : NphAdListener() {
                override fun onAdDismissed() {}
                override fun onAdFailed(error: AdError) {}
            }
        )
        finish()
        return true
    }
}
