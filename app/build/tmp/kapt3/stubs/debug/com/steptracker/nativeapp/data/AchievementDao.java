package com.steptracker.nativeapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/steptracker/nativeapp/data/AchievementDao;", "", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/steptracker/nativeapp/data/Achievement;", "getByCategory", "category", "", "getUnlocked", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnlockedCount", "", "insert", "", "achievement", "(Lcom/steptracker/nativeapp/data/Achievement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "achievements", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlock", "id", "date", "Ljava/time/LocalDate;", "current", "(Ljava/lang/String;Ljava/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface AchievementDao {
    
    @androidx.room.Query(value = "SELECT * FROM achievements ORDER BY category, threshold")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.steptracker.nativeapp.data.Achievement>> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM achievements WHERE category = :category")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.steptracker.nativeapp.data.Achievement>> getByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "SELECT * FROM achievements WHERE unlocked = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnlocked(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.steptracker.nativeapp.data.Achievement>> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM achievements WHERE unlocked = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUnlockedCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE achievements SET unlocked = 1, unlockedDate = :date, current = :current WHERE id = :id AND unlocked = 0")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object unlock(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, int current, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "UPDATE achievements SET current = :current WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int current, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.steptracker.nativeapp.data.Achievement achievement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.steptracker.nativeapp.data.Achievement> achievements, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}