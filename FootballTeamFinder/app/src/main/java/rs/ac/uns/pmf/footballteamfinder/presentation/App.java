package rs.ac.uns.pmf.footballteamfinder.presentation;

import android.app.Application;

import rs.ac.uns.pmf.footballteamfinder.core.data.LeagueRepository;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.GetLeaguesByCountryUseCase;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;
import rs.ac.uns.pmf.footballteamfinder.framework.AppViewModelFactory;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LeagueRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.LeagueMapper;

public class App extends Application {

    private AppViewModelFactory appViewModelFactory;

    @Override
    public void onCreate() {
        super.onCreate();

        //mappers
        LeagueMapper leagueMapper = new LeagueMapper();

        //repositories
        LeagueRepository englishLeagueRepository = new LeagueRepositoryImpl(leagueMapper);

        //use cases
        Interactors interactors = new Interactors(
                new GetLeaguesByCountryUseCase("england", englishLeagueRepository)
        );

        appViewModelFactory = new AppViewModelFactory(this, interactors);

    }

    public AppViewModelFactory getAppViewModelFactory() {
        return appViewModelFactory;
    }

}
