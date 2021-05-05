package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.os.Bundle;
import android.widget.Toast;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LeagueFragment.newInstance())
                    .commitNow();
        }

    }

    public void onLeagueItemClick(League league) {
        //TODO: for clicked league item show team details
        Toast.makeText(this, league.toString(), Toast.LENGTH_SHORT).show();
    }

}