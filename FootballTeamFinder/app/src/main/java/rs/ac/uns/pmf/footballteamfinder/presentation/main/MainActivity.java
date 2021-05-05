package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseActivity;

public class MainActivity extends BaseActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LeagueFragment.newInstance())
                    .commitNow();
        }

        //google ads
        MobileAds.initialize(this, initializationStatus -> {
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void onLeagueItemClick(League league) {
        //TODO: for clicked league item show team details
        Toast.makeText(this, league.toString(), Toast.LENGTH_SHORT).show();
    }

}