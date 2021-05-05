package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.framework.LeagueViewModel;
import rs.ac.uns.pmf.footballteamfinder.presentation.App;

public class MainFragment extends Fragment {

    private LeagueViewModel mLeagueViewModel;

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

        mLeagueViewModel = new ViewModelProvider(this, ((App) getActivity().getApplication()).getAppViewModelFactory()).get(LeagueViewModel.class);

        mLeagueViewModel.executeGetEnglishLeagueData();
        mLeagueViewModel.englishLeagueData.observe(this,
                leagueList ->
                {
                    Toast.makeText(getContext(), leagueList.toString(), Toast.LENGTH_SHORT).show();
                });

    }

}