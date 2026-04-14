package com.steptracker.nativeapp.sensor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 02\u00020\u0001:\u0003/01B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u000eJ\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\b\u0010&\u001a\u00020\u000fH\u0016J\"\u0010\'\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016J\b\u0010*\u001a\u00020\u000fH\u0002J\u0006\u0010+\u001a\u00020\u0006J\b\u0010,\u001a\u00020\u000fH\u0002J\u0006\u0010-\u001a\u00020\u000fJ\b\u0010.\u001a\u00020\u000fH\u0002R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00062"}, d2 = {"Lcom/steptracker/nativeapp/sensor/ActivityTrackingService;", "Landroid/app/Service;", "()V", "binder", "Lcom/steptracker/nativeapp/sensor/ActivityTrackingService$LocalBinder;", "isTracking", "", "<set-?>", "Lcom/steptracker/nativeapp/sensor/LocationTracker;", "locationTracker", "getLocationTracker", "()Lcom/steptracker/nativeapp/sensor/LocationTracker;", "onStatsUpdate", "Lkotlin/Function1;", "Lcom/steptracker/nativeapp/sensor/ActivityTrackingService$ActivityStats;", "", "getOnStatsUpdate", "()Lkotlin/jvm/functions/Function1;", "setOnStatsUpdate", "(Lkotlin/jvm/functions/Function1;)V", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "startSteps", "", "startTime", "Ljava/time/LocalDateTime;", "Lcom/steptracker/nativeapp/sensor/StepCounterManager;", "stepCounterManager", "getStepCounterManager", "()Lcom/steptracker/nativeapp/sensor/StepCounterManager;", "createNotification", "Landroid/app/Notification;", "getCurrentStats", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "startStatsUpdates", "startTracking", "stopStatsUpdates", "stopTracking", "updateNotification", "ActivityStats", "Companion", "LocalBinder", "app_debug"})
public final class ActivityTrackingService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final com.steptracker.nativeapp.sensor.ActivityTrackingService.LocalBinder binder = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private com.steptracker.nativeapp.sensor.LocationTracker locationTracker;
    private com.steptracker.nativeapp.sensor.StepCounterManager stepCounterManager;
    private boolean isTracking = false;
    @org.jetbrains.annotations.Nullable()
    private java.time.LocalDateTime startTime;
    private int startSteps = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.steptracker.nativeapp.sensor.ActivityTrackingService.ActivityStats, kotlin.Unit> onStatsUpdate;
    public static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final com.steptracker.nativeapp.sensor.ActivityTrackingService.Companion Companion = null;
    
    public ActivityTrackingService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.steptracker.nativeapp.sensor.LocationTracker getLocationTracker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.steptracker.nativeapp.sensor.StepCounterManager getStepCounterManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.steptracker.nativeapp.sensor.ActivityTrackingService.ActivityStats, kotlin.Unit> getOnStatsUpdate() {
        return null;
    }
    
    public final void setOnStatsUpdate(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.steptracker.nativeapp.sensor.ActivityTrackingService.ActivityStats, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public final boolean startTracking() {
        return false;
    }
    
    public final void stopTracking() {
    }
    
    public final boolean isTracking() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.steptracker.nativeapp.sensor.ActivityTrackingService.ActivityStats getCurrentStats() {
        return null;
    }
    
    private final void startStatsUpdates() {
    }
    
    private final void stopStatsUpdates() {
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    private final void updateNotification() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/steptracker/nativeapp/sensor/ActivityTrackingService$ActivityStats;", "", "duration", "", "steps", "", "distance", "", "calories", "speed", "", "(Ljava/lang/String;IDIF)V", "getCalories", "()I", "getDistance", "()D", "getDuration", "()Ljava/lang/String;", "getSpeed", "()F", "getSteps", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
    public static final class ActivityStats {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String duration = null;
        private final int steps = 0;
        private final double distance = 0.0;
        private final int calories = 0;
        private final float speed = 0.0F;
        
        public ActivityStats(@org.jetbrains.annotations.NotNull()
        java.lang.String duration, int steps, double distance, int calories, float speed) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDuration() {
            return null;
        }
        
        public final int getSteps() {
            return 0;
        }
        
        public final double getDistance() {
            return 0.0;
        }
        
        public final int getCalories() {
            return 0;
        }
        
        public final float getSpeed() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.steptracker.nativeapp.sensor.ActivityTrackingService.ActivityStats copy(@org.jetbrains.annotations.NotNull()
        java.lang.String duration, int steps, double distance, int calories, float speed) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/steptracker/nativeapp/sensor/ActivityTrackingService$Companion;", "", "()V", "NOTIFICATION_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/steptracker/nativeapp/sensor/ActivityTrackingService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/steptracker/nativeapp/sensor/ActivityTrackingService;)V", "getService", "Lcom/steptracker/nativeapp/sensor/ActivityTrackingService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        public LocalBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.steptracker.nativeapp.sensor.ActivityTrackingService getService() {
            return null;
        }
    }
}