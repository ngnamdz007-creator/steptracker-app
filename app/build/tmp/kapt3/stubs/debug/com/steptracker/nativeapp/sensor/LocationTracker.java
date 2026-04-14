package com.steptracker.nativeapp.sensor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u000212B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002J\u001c\u0010%\u001a\u00020&2\u0014\u0010\'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020&0(J\u0006\u0010*\u001a\u00020\u0017J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020)H\u0002J\u0006\u0010-\u001a\u00020&J\u000e\u0010.\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010/\u001a\u00020\u0017J\u0006\u00100\u001a\u00020&R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011\u00a8\u00063"}, d2 = {"Lcom/steptracker/nativeapp/sensor/LocationTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_coordinates", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/steptracker/nativeapp/sensor/LocationTracker$Coordinate;", "_currentSpeed", "", "_maxSpeed", "_totalDistance", "", "coordinates", "Lkotlinx/coroutines/flow/StateFlow;", "getCoordinates", "()Lkotlinx/coroutines/flow/StateFlow;", "currentSpeed", "getCurrentSpeed", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "isTracking", "", "listener", "Lcom/steptracker/nativeapp/sensor/LocationTracker$LocationListener;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "maxSpeed", "getMaxSpeed", "totalDistance", "getTotalDistance", "calculateDistance", "lat1", "lon1", "lat2", "lon2", "getCurrentLocation", "", "onResult", "Lkotlin/Function1;", "Landroid/location/Location;", "hasLocationPermission", "processLocation", "location", "reset", "setListener", "startTracking", "stopTracking", "Coordinate", "LocationListener", "app_debug"})
public final class LocationTracker {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.LocationCallback locationCallback;
    private boolean isTracking = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.steptracker.nativeapp.sensor.LocationTracker.Coordinate>> _coordinates = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.steptracker.nativeapp.sensor.LocationTracker.Coordinate>> coordinates = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> _totalDistance = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> totalDistance = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> _currentSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> currentSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> _maxSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> maxSpeed = null;
    @org.jetbrains.annotations.Nullable()
    private com.steptracker.nativeapp.sensor.LocationTracker.LocationListener listener;
    
    public LocationTracker(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.steptracker.nativeapp.sensor.LocationTracker.Coordinate>> getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getCurrentSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getMaxSpeed() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.steptracker.nativeapp.sensor.LocationTracker.LocationListener listener) {
    }
    
    public final boolean startTracking() {
        return false;
    }
    
    private final void processLocation(android.location.Location location) {
    }
    
    public final void stopTracking() {
    }
    
    public final void reset() {
    }
    
    public final void getCurrentLocation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> onResult) {
    }
    
    public final boolean isTracking() {
        return false;
    }
    
    public final boolean hasLocationPermission() {
        return false;
    }
    
    private final double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return 0.0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/steptracker/nativeapp/sensor/LocationTracker$Coordinate;", "", "latitude", "", "longitude", "accuracy", "", "timestamp", "", "speed", "altitude", "(DDFJFD)V", "getAccuracy", "()F", "getAltitude", "()D", "getLatitude", "getLongitude", "getSpeed", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Coordinate {
        private final double latitude = 0.0;
        private final double longitude = 0.0;
        private final float accuracy = 0.0F;
        private final long timestamp = 0L;
        private final float speed = 0.0F;
        private final double altitude = 0.0;
        
        public Coordinate(double latitude, double longitude, float accuracy, long timestamp, float speed, double altitude) {
            super();
        }
        
        public final double getLatitude() {
            return 0.0;
        }
        
        public final double getLongitude() {
            return 0.0;
        }
        
        public final float getAccuracy() {
            return 0.0F;
        }
        
        public final long getTimestamp() {
            return 0L;
        }
        
        public final float getSpeed() {
            return 0.0F;
        }
        
        public final double getAltitude() {
            return 0.0;
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        public final double component6() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.steptracker.nativeapp.sensor.LocationTracker.Coordinate copy(double latitude, double longitude, float accuracy, long timestamp, float speed, double altitude) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/steptracker/nativeapp/sensor/LocationTracker$LocationListener;", "", "onLocationUpdate", "", "coordinate", "Lcom/steptracker/nativeapp/sensor/LocationTracker$Coordinate;", "distanceDelta", "", "totalDistance", "onSpeedUpdate", "currentSpeed", "", "maxSpeed", "app_debug"})
    public static abstract interface LocationListener {
        
        public abstract void onLocationUpdate(@org.jetbrains.annotations.NotNull()
        com.steptracker.nativeapp.sensor.LocationTracker.Coordinate coordinate, double distanceDelta, double totalDistance);
        
        public abstract void onSpeedUpdate(float currentSpeed, float maxSpeed);
    }
}