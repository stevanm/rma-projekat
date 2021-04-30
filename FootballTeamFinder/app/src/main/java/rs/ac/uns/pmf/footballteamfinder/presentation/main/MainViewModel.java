package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import rs.ac.uns.pmf.footballteamfinder.domain.IRepository;
import rs.ac.uns.pmf.footballteamfinder.domain.RemoteRepository;
import rs.ac.uns.pmf.footballteamfinder.model.remote.league.LeagueApi;

public class MainViewModel extends ViewModel {

    private IRepository repository;

    public MainViewModel() {
        repository = RemoteRepository.getRepository();
    }

    public void loadEnglishLeagueDataRemotely(int seasonYear) {
        repository.loadEnglishLeagueDataRemotely(seasonYear);
    }

    public MutableLiveData<LeagueApi> englishLeagueData() {
        return ((RemoteRepository) repository).englishLeagueData;
    }

}