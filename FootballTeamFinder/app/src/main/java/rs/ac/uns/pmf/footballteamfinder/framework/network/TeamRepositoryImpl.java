package rs.ac.uns.pmf.footballteamfinder.framework.network;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rs.ac.uns.pmf.footballteamfinder.core.data.TeamRepository;
import rs.ac.uns.pmf.footballteamfinder.core.domain.Team;
import rs.ac.uns.pmf.footballteamfinder.core.mappers.TeamMapper;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.team.TeamApiNetworkEntity;

public class TeamRepositoryImpl implements TeamRepository {

    public static final String TAG = TeamRepositoryImpl.class.getSimpleName();

    private final TeamMapper teamMapper;

    private final MutableLiveData<List<Team>> mTeams = new MutableLiveData<>();
    public LiveData<List<Team>> teams = mTeams;

    public TeamRepositoryImpl(TeamMapper teamMapper) {
        this.teamMapper = teamMapper;
    }


    @Override
    public void getTeamsBySeasonAndLeagueId(Integer season, Integer leagueId) {
        Call<TeamApiNetworkEntity> call = AppMainNetworkService.getAppMainNetworkService().create(AppMainApi.class).getTeamsBySeasonAndLeagueId(season, leagueId);
        call.enqueue(new Callback<TeamApiNetworkEntity>() {
            @Override
            public void onResponse(Call<TeamApiNetworkEntity> call, Response<TeamApiNetworkEntity> response) {
                if (response.isSuccessful()) {
                    List<Team> teams = teamMapper.mapFromEntityList(response.body().getResponse());
                    mTeams.postValue(teams);
                } else {
                    Log.d(TAG, "onResponse: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<TeamApiNetworkEntity> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t);
            }
        });
    }
}
