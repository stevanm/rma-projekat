package rs.ac.uns.pmf.footballteamfinder.presentation;

import android.app.Application;

import rs.ac.uns.pmf.footballteamfinder.core.data.LeagueRepository;
import rs.ac.uns.pmf.footballteamfinder.core.data.TeamRepository;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.GetLeaguesByCountryUseCase;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;
import rs.ac.uns.pmf.footballteamfinder.core.mappers.LeagueMapper;
import rs.ac.uns.pmf.footballteamfinder.core.mappers.TeamMapper;
import rs.ac.uns.pmf.footballteamfinder.framework.AppViewModelFactory;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LeagueRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.framework.network.TeamRepositoryImpl;

public class App extends Application {

    private AppViewModelFactory appViewModelFactory;

    private LeagueRepository leagueRepository;
    private TeamRepository teamRepository;

    @Override
    public void onCreate() {
        super.onCreate();

        //mappers
        LeagueMapper leagueMapper = new LeagueMapper();
        TeamMapper teamMapper = new TeamMapper();

        //repositories
        leagueRepository = new LeagueRepositoryImpl(leagueMapper);
        teamRepository = new TeamRepositoryImpl(teamMapper);

        //use cases
        Interactors interactors = new Interactors(
                new GetLeaguesByCountryUseCase("germany", leagueRepository)
        );

        appViewModelFactory = new AppViewModelFactory(this, interactors);

    }

    public AppViewModelFactory getAppViewModelFactory() {
        return appViewModelFactory;
    }

    public LeagueRepository getLeagueRepository() {
        return leagueRepository;
    }

    public TeamRepository getTeamRepository() {
        return teamRepository;
    }

}
