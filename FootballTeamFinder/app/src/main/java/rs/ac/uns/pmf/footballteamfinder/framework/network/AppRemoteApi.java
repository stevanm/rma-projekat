package rs.ac.uns.pmf.footballteamfinder.framework.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues.LeagueApiNetworkEntity;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.team.TeamApiNetworkEntity;

public interface AppRemoteApi {

    //get the list of available leagues and cups
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v3/leagues")
    Call<LeagueApiNetworkEntity> getLeaguesByCountryName(
            @Query("country") String country
    );

    //returns the statistics of a team in relation to a given competition and season
    // https://api-football-v1.p.rapidapi.com/v3/teams?search=country
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v3/teams")
    Call<TeamApiNetworkEntity> getTeamsBySeasonAndLeagueId(
            @Query("season") Integer season,
            @Query("league") Integer leagueId
    );

}
