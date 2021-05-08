package rs.ac.uns.pmf.footballteamfinder.framework;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.Address;
import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.core.domain.Team;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.GetReverseGeoCoddingAddressData;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.GetTeamBySeasonAndLeagueIdUseCase;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LeagueRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LocationRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.framework.network.TeamRepositoryImpl;
import rs.ac.uns.pmf.footballteamfinder.presentation.App;

public class LeagueViewModel extends AppViewModel {

    public LiveData<List<League>> leagueData;
    public LiveData<List<Team>> teamsData;
    public LiveData<Address> addressData;

    public LeagueViewModel(@NonNull Application application, Interactors interactors) {
        super(application, interactors);
        leagueData = ((LeagueRepositoryImpl) interactors.getGetLeaguesByCountryUseCase().getLeagueRepository()).leagues;
        teamsData = ((TeamRepositoryImpl) (((App) getApplication()).getTeamRepository())).teams;
        addressData = ((LocationRepositoryImpl) (((App) getApplication()).getLocationRepository())).address;
    }

    public void executeGetLeaguesByCountry(String country) {
        getInteractors().getGetLeaguesByCountryUseCase().setCountry(country);
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

    public void executeGetReverseGeoCoddingAddressData(double longitude, double latitude) {
        GetReverseGeoCoddingAddressData getReverseGeoCoddingAddressData = new GetReverseGeoCoddingAddressData(
                longitude,
                latitude,
                (((App) getApplication()).getLocationRepository())
        );
        getReverseGeoCoddingAddressData.execute();
    }

}
