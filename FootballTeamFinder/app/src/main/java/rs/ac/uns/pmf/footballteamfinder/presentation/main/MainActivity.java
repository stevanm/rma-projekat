package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.os.Bundle;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseActivity;

public class MainActivity extends BaseActivity {

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