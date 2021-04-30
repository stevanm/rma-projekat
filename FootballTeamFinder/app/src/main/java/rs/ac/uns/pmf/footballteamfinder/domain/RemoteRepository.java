package rs.ac.uns.pmf.footballteamfinder.domain;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rs.ac.uns.pmf.footballteamfinder.model.remote.league.LeagueApi;
import rs.ac.uns.pmf.footballteamfinder.network.NetworkService;
import rs.ac.uns.pmf.footballteamfinder.network.RemoteApi;

public class RemoteRepository implements IRepository {

    public static final String TAG = RemoteRepository.class.getSimpleName();

    private static IRepository instance;

    //returned data
    public MutableLiveData<LeagueApi> englishLeagueData = new MutableLiveData<>();


    private RemoteRepository() {
    }

    public static IRepository getRepository() {
        if (instance == null) {
            instance = new RemoteRepository();
        }
        return instance;
    }

    @Override
    public void loadEnglishLeagueDataRemotely(int seasonYear) {
        Call<LeagueApi> call = NetworkService.getNetworkService().create(RemoteApi.class).getEnglishLeagueData(seasonYear);
        call.enqueue(new Callback<LeagueApi>() {
            @Override
            public void onResponse(Call<LeagueApi> call, Response<LeagueApi> response) {
                if (response.isSuccessful()) {
                    englishLeagueData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<LeagueApi> call, Throwable t) {
                Log.d(TAG, "onFailure: ", t);
            }
        });
    }

}
