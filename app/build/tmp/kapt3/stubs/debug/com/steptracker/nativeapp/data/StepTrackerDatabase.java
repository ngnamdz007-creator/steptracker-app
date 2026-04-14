package com.steptracker.nativeapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/steptracker/nativeapp/data/StepTrackerDatabase;", "Landroidx/room/RoomDatabase;", "()V", "achievementDao", "Lcom/steptracker/nativeapp/data/AchievementDao;", "activityDao", "Lcom/steptracker/nativeapp/data/ActivityDao;", "dailyDataDao", "Lcom/steptracker/nativeapp/data/DailyDataDao;", "userSettingsDao", "Lcom/steptracker/nativeapp/data/UserSettingsDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.steptracker.nativeapp.data.DailyData.class, com.steptracker.nativeapp.data.ActivityRecord.class, com.steptracker.nativeapp.data.Achievement.class, com.steptracker.nativeapp.data.UserSettings.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.steptracker.nativeapp.data.Converters.class})
public abstract class StepTrackerDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.steptracker.nativeapp.data.StepTrackerDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.steptracker.nativeapp.data.StepTrackerDatabase.Companion Companion = null;
    
    public StepTrackerDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.steptracker.nativeapp.data.DailyDataDao dailyDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.steptracker.nativeapp.data.ActivityDao activityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.steptracker.nativeapp.data.AchievementDao achievementDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.steptracker.nativeapp.data.UserSettingsDao userSettingsDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/steptracker/nativeapp/data/StepTrackerDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/steptracker/nativeapp/data/StepTrackerDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.steptracker.nativeapp.data.StepTrackerDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}