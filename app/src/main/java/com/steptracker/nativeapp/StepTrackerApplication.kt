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
        try {
            // Try manual config loading from assets
            val configJson = assets.open("ads_config.json").bufferedReader().use { it.readText() }
            Log.d("StepTrackerApplication", "=== Config JSON loaded: ${configJson.length} chars ===")
            
            NphSdk.init(
                context = this,
                apiKey = "nph_VTpE0KYrSQdsI6X0Qx5VyH_ydVhdIzBV",
                configSource = ConfigSource.FIREBASE,  // v1.0.1 only supports FIREBASE
                enableDebug = true
            )
            Log.d("StepTrackerApplication", "=== NphSdk.init() CALLED SUCCESS ===")
        } catch (e: Exception) {
            Log.e("StepTrackerApplication", "=== NphSdk.init() FAILED: ${e.message}", e)
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
