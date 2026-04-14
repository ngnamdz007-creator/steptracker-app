package com.steptracker.nativeapp.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/steptracker/nativeapp/ui/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnAbout", "Landroid/widget/LinearLayout;", "btnEditAvatar", "Landroid/widget/ImageButton;", "btnPrivacy", "btnRate", "btnSave", "Lcom/google/android/material/button/MaterialButton;", "btnShare", "currentSettings", "Lcom/steptracker/nativeapp/data/UserSettings;", "etDailyGoal", "Landroid/widget/EditText;", "etUserName", "etWeight", "ivAvatar", "Lcom/google/android/material/imageview/ShapeableImageView;", "repository", "Lcom/steptracker/nativeapp/data/DataRepository;", "switchNotifications", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "initViews", "", "loadSettings", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "rateApp", "saveSettings", "setupListeners", "shareApp", "showAbout", "showPrivacyPolicy", "app_debug"})
public final class SettingsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.steptracker.nativeapp.data.DataRepository repository;
    private com.google.android.material.imageview.ShapeableImageView ivAvatar;
    private android.widget.ImageButton btnEditAvatar;
    private android.widget.EditText etUserName;
    private android.widget.EditText etDailyGoal;
    private android.widget.EditText etWeight;
    private com.google.android.material.switchmaterial.SwitchMaterial switchNotifications;
    private com.google.android.material.button.MaterialButton btnSave;
    private android.widget.LinearLayout btnShare;
    private android.widget.LinearLayout btnRate;
    private android.widget.LinearLayout btnAbout;
    private android.widget.LinearLayout btnPrivacy;
    @org.jetbrains.annotations.Nullable()
    private com.steptracker.nativeapp.data.UserSettings currentSettings;
    
    public SettingsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void setupListeners() {
    }
    
    private final void loadSettings() {
    }
    
    private final void saveSettings() {
    }
    
    private final void shareApp() {
    }
    
    private final void rateApp() {
    }
    
    private final void showAbout() {
    }
    
    private final void showPrivacyPolicy() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}