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

public class LeagueFragment extends BaseFragment {

    private LeagueViewModel mLeagueViewModel;

    private RecyclerView recyclerView;
    private LeagueAdapter leagueAdapter;

    private Context context;

    private String mCountry;

    public static LeagueFragment newInstance(String country) {
        Bundle args = new Bundle();
        args.putString("country", country);
        LeagueFragment fragment = new LeagueFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.league_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.leaguesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        leagueAdapter = new LeagueAdapter(context);
        recyclerView.setAdapter(leagueAdapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (null != getArguments() && !getArguments().isEmpty()) {
            mCountry = getArguments().getString("country");
        }

        mLeagueViewModel = new ViewModelProvider(requireActivity(), ((App) getActivity().getApplication()).getAppViewModelFactory()).get(LeagueViewModel.class);

        mLeagueViewModel.executeGetLeaguesByCountry(mCountry);
        mLeagueViewModel.leagueData.observe(requireActivity(),
                leagueList ->
                {
                    leagueAdapter.setList(leagueList);
                });

    }

}