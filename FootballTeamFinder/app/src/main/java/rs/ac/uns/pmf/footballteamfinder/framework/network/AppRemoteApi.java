package rs.ac.uns.pmf.footballteamfinder.framework.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leaguesbycountry.LeagueApiNetworkEntity;

public interface AppRemoteApi {

    //leagues by country name
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v3/leagues")
    Call<LeagueApiNetworkEntity> getLeaguesByCountryName(
            @Query("country") String country
    );

    //teams statistics by season
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v3/teams/statistics")
    Call<Void> getTeamStatisticsBySeason(
            @Query("season") int season,
            @Query("league") String league
    );

}
