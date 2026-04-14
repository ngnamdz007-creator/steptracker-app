package com.steptracker.nativeapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002J\u0012\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0016\u0010-\u001a\u00020\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/steptracker/nativeapp/ui/StepsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activityRepository", "Lcom/steptracker/nativeapp/data/DataRepository;", "pieChart", "Lcom/github/mikephil/charting/charts/PieChart;", "rvRecentActivity", "Landroidx/recyclerview/widget/RecyclerView;", "rvWeekly", "tvActiveMin", "Landroid/widget/TextView;", "tvGoal", "tvKcal", "tvKm", "tvProgress", "tvSteps", "tvTime", "viewModel", "Lcom/steptracker/nativeapp/ui/StepsViewModel;", "weightChart", "Lcom/github/mikephil/charting/charts/LineChart;", "observeData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupCharts", "setupRecentActivityRecyclerView", "setupRecyclerView", "updatePieChart", "completed", "", "remaining", "updateUI", "data", "Lcom/steptracker/nativeapp/data/DailyData;", "updateWeeklyChart", "weeklyData", "", "app_debug"})
public final class StepsFragment extends androidx.fragment.app.Fragment {
    private com.steptracker.nativeapp.ui.StepsViewModel viewModel;
    private com.github.mikephil.charting.charts.PieChart pieChart;
    private com.github.mikephil.charting.charts.LineChart weightChart;
    private android.widget.TextView tvSteps;
    private android.widget.TextView tvGoal;
    private android.widget.TextView tvProgress;
    private android.widget.TextView tvTime;
    private android.widget.TextView tvKcal;
    private android.widget.TextView tvKm;
    private android.widget.TextView tvActiveMin;
    private androidx.recyclerview.widget.RecyclerView rvWeekly;
    private androidx.recyclerview.widget.RecyclerView rvRecentActivity;
    private com.steptracker.nativeapp.data.DataRepository activityRepository;
    
    public StepsFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecentActivityRecyclerView() {
    }
    
    private final void setupCharts() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void observeData() {
    }
    
    private final void updateUI(com.steptracker.nativeapp.data.DailyData data) {
    }
    
    private final void updatePieChart(int completed, int remaining) {
    }
    
    private final void updateWeeklyChart(java.util.List<com.steptracker.nativeapp.data.DailyData> weeklyData) {
    }
}