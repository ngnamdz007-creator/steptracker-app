package com.steptracker.nativeapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0016\u0010&\u001a\u00020\u00162\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\"\u0010+\u001a\u00020\u00162\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0-0(H\u0002J\u0016\u0010/\u001a\u00020\u00162\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/steptracker/nativeapp/ui/ReportFragment;", "Landroidx/fragment/app/Fragment;", "()V", "barChart", "Lcom/github/mikephil/charting/charts/BarChart;", "btnDay", "Lcom/google/android/material/button/MaterialButton;", "btnMonth", "btnWeek", "btnYear", "currentPeriod", "", "lineChart", "Lcom/github/mikephil/charting/charts/LineChart;", "tvDailyAverage", "Landroid/widget/TextView;", "tvTotalCalories", "tvTotalDistance", "tvTotalSteps", "viewModel", "Lcom/steptracker/nativeapp/ui/ReportViewModel;", "observeData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "selectPeriod", "period", "setupCharts", "setupPeriodButtons", "updateBarChart", "data", "", "Lcom/steptracker/nativeapp/data/DailyData;", "updateButtonStyles", "updateLineChart", "comparison", "Lkotlin/Pair;", "", "updateStats", "app_debug"})
public final class ReportFragment extends androidx.fragment.app.Fragment {
    private com.steptracker.nativeapp.ui.ReportViewModel viewModel;
    private com.github.mikephil.charting.charts.BarChart barChart;
    private com.github.mikephil.charting.charts.LineChart lineChart;
    private android.widget.TextView tvTotalSteps;
    private android.widget.TextView tvTotalDistance;
    private android.widget.TextView tvTotalCalories;
    private android.widget.TextView tvDailyAverage;
    private com.google.android.material.button.MaterialButton btnDay;
    private com.google.android.material.button.MaterialButton btnWeek;
    private com.google.android.material.button.MaterialButton btnMonth;
    private com.google.android.material.button.MaterialButton btnYear;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPeriod = "week";
    
    public ReportFragment() {
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
    
    private final void setupPeriodButtons() {
    }
    
    private final void selectPeriod(java.lang.String period) {
    }
    
    private final void updateButtonStyles() {
    }
    
    private final void setupCharts() {
    }
    
    private final void observeData() {
    }
    
    private final void updateStats(java.util.List<com.steptracker.nativeapp.data.DailyData> data) {
    }
    
    private final void updateBarChart(java.util.List<com.steptracker.nativeapp.data.DailyData> data) {
    }
    
    private final void updateLineChart(java.util.List<kotlin.Pair<java.lang.Float, java.lang.Float>> comparison) {
    }
}