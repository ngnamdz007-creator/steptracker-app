package com.steptracker.nativeapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\'J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\'J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001f"}, d2 = {"Lcom/steptracker/nativeapp/data/DailyDataDao;", "", "addSteps", "", "date", "Ljava/time/LocalDate;", "steps", "", "(Ljava/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByDate", "Lcom/steptracker/nativeapp/data/DailyData;", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoalAchievementCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRange", "Lkotlinx/coroutines/flow/Flow;", "", "startDate", "endDate", "getRangeSync", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecent", "limit", "getTotalCalories", "getTotalDistance", "", "getTotalSteps", "insert", "data", "(Lcom/steptracker/nativeapp/data/DailyData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface DailyDataDao {
    
    @androidx.room.Query(value = "SELECT * FROM daily_data WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.steptracker.nativeapp.data.DailyData> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM daily_data WHERE date BETWEEN :startDate AND :endDate ORDER BY date")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.steptracker.nativeapp.data.DailyData>> getRange(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate);
    
    @androidx.room.Query(value = "SELECT * FROM daily_data WHERE date BETWEEN :startDate AND :endDate ORDER BY date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRangeSync(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate startDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.steptracker.nativeapp.data.DailyData>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM daily_data ORDER BY date DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.steptracker.nativeapp.data.DailyData>> getRecent(int limit);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.steptracker.nativeapp.data.DailyData data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.steptracker.nativeapp.data.DailyData data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE daily_data SET currentSteps = currentSteps + :steps WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSteps(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, int steps, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(currentSteps) as total FROM daily_data")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalSteps(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(km) as total FROM daily_data")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalDistance(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(kcal) as total FROM daily_data")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalCalories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM daily_data WHERE currentSteps >= dailyGoal")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGoalAchievementCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}