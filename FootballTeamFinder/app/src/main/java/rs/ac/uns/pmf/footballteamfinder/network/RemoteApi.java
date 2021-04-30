package rs.ac.uns.pmf.footballteamfinder.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rs.ac.uns.pmf.footballteamfinder.model.remote.league.LeagueApi;
import rs.ac.uns.pmf.footballteamfinder.model.remote.leaguetable.LeagueTableApi;
import rs.ac.uns.pmf.footballteamfinder.model.remote.player.PlayerApi;
import rs.ac.uns.pmf.footballteamfinder.model.remote.teamdetails.TeamsDetailsApi;

public interface RemoteApi {

    //all leagues
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v2/leagues/country/england/{season_year}")
    Call<LeagueApi> getEnglishLeagueData(
            @Path("season_year") int seasonYear
    );

    //league table
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("leagueTable/{leagueId}")
    Call<LeagueTableApi> getLeagueTable(
            @Path("leagueId") long leagueId
    );

    //teams details
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v2/teams/league/{leagueId}")
    Call<TeamsDetailsApi> getTeamsDetails(
            @Path("leagueId") long leagueId
    );

    //player info by teamID and season-period
    @Headers({
            "x-rapidapi-host:api-football-v1.p.rapidapi.com",
            "x-rapidapi-key:63284ca007msh15dbd714e326824p1120e4jsn99bdcaf89bea"
    })
    @GET("v2/players/team/{teamId}/{season_period}")
    Call<PlayerApi> getPlayersDetails(
            @Path("teamId") long teamId,
            @Path("season_period") String seasonPeriod
    );

}
