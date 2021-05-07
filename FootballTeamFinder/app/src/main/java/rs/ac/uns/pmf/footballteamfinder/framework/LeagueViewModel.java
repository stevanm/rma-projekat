package rs.ac.uns.pmf.footballteamfinder.framework;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.core.domain.Team;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.GetTeamBySeasonAndLeagueIdUseCase;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LeagueRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.framework.network.TeamRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.presentation.App;

public class LeagueViewModel extends AppViewModel {

    public LiveData<List<League>> leagueData;
    public LiveData<List<Team>> teamsData;

    public LeagueViewModel(@NonNull Application application, Interactors interactors) {
        super(application, interactors);
        leagueData = ((LeagueRepositoryImpl) interactors.getGetLeaguesByCountryUseCase().getLeagueRepository()).leagues;
        teamsData = ((TeamRepositoryImpl) (((App) getApplication()).getTeamRepository())).teams;
    }

    public void executeGetLeaguesByCountry() {
        getInteractors().getGetLeaguesByCountryUseCase().execute();
    }

    public void executeGetTeamByCountryNameAndLeague(Integer season, Integer league) {
        GetTeamBySeasonAndLeagueIdUseCase teamByCountryNameAndLeagueUseCase = new GetTeamBySeasonAndLeagueIdUseCase(
                season,
                league,
                (((App) getApplication()).getTeamRepository())
        );
        teamByCountryNameAndLeagueUseCase.execute();
    }

}
