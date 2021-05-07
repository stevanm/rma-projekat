package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.framework.LeagueViewModel;
import rs.ac.uns.pmf.footballteamfinder.presentation.App;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseFragment;


public class TeamFragment extends BaseFragment {

    private LeagueViewModel mLeagueViewModel;

    private RecyclerView recyclerView;
    private TeamAdapter teamAdapter;

    private Context context;

    public static TeamFragment newInstance(int leagueId) {
        Bundle args = new Bundle();
        args.putInt("leagueId", leagueId);
        TeamFragment fragment = new TeamFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_team_statistics, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.teamRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        teamAdapter = new TeamAdapter(context);
        recyclerView.setAdapter(teamAdapter);


        Integer season = 2019;
        Integer leagueId = null;
        if (getArguments() != null) {
            leagueId = getArguments().getInt("leagueId");
        }

        mLeagueViewModel = new ViewModelProvider(this, ((App) getActivity().getApplication()).getAppViewModelFactory()).get(LeagueViewModel.class);

        mLeagueViewModel.executeGetTeamByCountryNameAndLeague(season, leagueId);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mLeagueViewModel.teamsData.observe(this,
                teamList ->
                {
                    teamAdapter.setList(teamList);
                });

    }
}