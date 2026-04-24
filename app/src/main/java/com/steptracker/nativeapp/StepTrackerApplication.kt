package com.steptracker.nativeapp

import android.app.Application
import android.util.Log
import com.steptracker.nativeapp.data.DataRepository
import com.nphlab.sdk.ads.NphSdk
import com.nphlab.sdk.config.ConfigSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class StepTrackerApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    
    override fun onCreate() {
        super.onCreate()
        
        Log.d("StepTrackerApplication", "=== APPLICATION onCreate START ===")
        
        // Init NPH SDK - Load config from Firebase (fallback to assets/ads_config.json)
        // ISSUE #2: Firebase Remote Config cần có key 'nph_ads_config' được setup bởi mentor
        // ISSUE #3: Step Tracker đã bị bind signature trên server (hash: B7BB61D923C9FAA...)
        //   → Nếu build trên máy khác hoặc dùng keystore khác sẽ bị "Signature mismatch"
        //   → Liên hệ mentor để reset signature hoặc dùng cùng keystore
        // Fallback chain khi Firebase chưa setup: Firebase → Cache → Local assets
        try {
            // Verify local config exists (used as Firebase fallback)
            val configJson = assets.open("ads_config.json").bufferedReader().use { it.readText() }
            Log.d("StepTrackerApplication", "=== Local ads_config.json loaded: ${configJson.length} chars ===")
            
            NphSdk.init(
                context = this,
                apiKey = "nph_VTpE0KYrSQdsI6X0Qx5VyH_ydVhdIzBV",
                configSource = ConfigSource.FIREBASE,  // v1.0.1 only supports FIREBASE
                enableDebug = true  // Force debug mode - logs all NPH SDK events
            )
            Log.d("StepTrackerApplication", "=== NphSdk.init() called ===")
            Log.d("StepTrackerApplication", "=== SDK will try: Firebase → Cache → Local assets ===")
        } catch (e: Exception) {
            Log.e("StepTrackerApplication", "=== NphSdk.init() FAILED: ${e.message}", e)
            Log.e("StepTrackerApplication", "=== Possible causes: License key mismatch, Signature mismatch, or Network error ===")
        }
        
        // Initialize database with default data on first run
        applicationScope.launch {
            val repository = DataRepository(this@StepTrackerApplication)
            
            // Ensure user settings exist
            repository.getOrCreateSettings()
            
            // Initialize achievements if needed
            repository.initializeAchievements()
            
            // Create today's data entry
            repository.getOrCreateTodayData()
        }
    }
}
