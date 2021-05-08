package rs.ac.uns.pmf.footballteamfinder.framework.network;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rs.ac.uns.pmf.footballteamfinder.core.data.LeagueRepository;
import rs.ac.uns.pmf.footballteamfinder.core.domain.League;
import rs.ac.uns.pmf.footballteamfinder.core.mappers.LeagueMapper;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues.LeagueApiNetworkEntity;

public class LeagueRepositoryImpl implements LeagueRepository {

    public static final String TAG = LeagueRepositoryImpl.class.getSimpleName();

    private final LeagueMapper leagueMapper;

    private final MutableLiveData<List<League>> mLeagues = new MutableLiveData<>();
    public LiveData<List<League>> leagues = mLeagues;

    public LeagueRepositoryImpl(LeagueMapper leagueMapper) {
        this.leagueMapper = leagueMapper;
    }


    @Override
    public void getLeaguesByCountryName(String country) {
        Call<LeagueApiNetworkEntity> call = AppMainNetworkService.getAppMainNetworkService().create(AppMainApi.class).getLeaguesByCountryName(country);
        call.enqueue(new Callback<LeagueApiNetworkEntity>() {
            @Override
            public void onResponse(@NotNull Call<LeagueApiNetworkEntity> call, @NotNull Response<LeagueApiNetworkEntity> response) {
                if (response.isSuccessful()) {
                    List<League> leagues = leagueMapper.mapFromEntityList(response.body().getResponse());
                    mLeagues.postValue(leagues);
                } else {
                    Log.d(TAG, "onResponse: " + response.message());
                }
            }

            @Override
            public void onFailure(@NotNull Call<LeagueApiNetworkEntity> call, @NotNull Throwable t) {
                Log.d(TAG, "onFailure: " + t);
            }
        });
    }
}
