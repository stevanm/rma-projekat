package rs.ac.uns.pmf.footballteamfinder.core.data;

public interface TeamRepository {

    void getTeamsBySeasonAndLeagueId(Integer season, Integer leagueId);

}
