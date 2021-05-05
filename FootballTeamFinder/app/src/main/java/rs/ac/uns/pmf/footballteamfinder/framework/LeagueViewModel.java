package rs.ac.uns.pmf.footballteamfinder.framework;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;
import rs.ac.uns.pmf.footballteamfinder.framework.network.LeagueRepositoryImpl;

public class LeagueViewModel extends AppViewModel {

    public LiveData<List<League>> englishLeagueData;

    public LeagueViewModel(@NonNull Application application, Interactors interactors) {
        super(application, interactors);
        englishLeagueData = ((LeagueRepositoryImpl) interactors.getGetLeaguesByCountryUseCase().getLeagueRepository()).leagues;
    }

    public void executeGetEnglishLeagueData() {
        getInteractors().getGetLeaguesByCountryUseCase().execute();
    }

}
