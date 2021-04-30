package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.model.remote.league.LeagueApi;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mViewModel.loadEnglishLeagueDataRemotely(2019);
        mViewModel.englishLeagueData().observe(this, new Observer<LeagueApi>() {
            @Override
            public void onChanged(LeagueApi leagueApi) {
                Toast.makeText(getContext(), "Data: " + leagueApi.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

}