package rs.ac.uns.pmf.footballteamfinder.presentation.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseActivity;
import rs.ac.uns.pmf.footballteamfinder.presentation.main.MainActivity;
import rs.ac.uns.pmf.footballteamfinder.utils.PermissionUtils;

public class SplashActivity extends BaseActivity {

    private View layout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = LayoutInflater.from(this).inflate(R.layout.splash_activity, null, false);
        setContentView(layout);

        //check permissions granted
        Dexter.withContext(this)
                .withPermissions(PermissionUtils.requiredPermissions)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        if (report.areAllPermissionsGranted()) {
                            Snackbar.make(layout, R.string.all_permission_granted, Snackbar.LENGTH_SHORT).show();
                            startMainScreen();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                }).check();

    }

    void startMainScreen() {
        Handler handler = new Handler(getMainLooper());
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2000);
    }

}
