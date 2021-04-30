package rs.ac.uns.pmf.footballteamfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import rs.ac.uns.pmf.footballteamfinder.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}