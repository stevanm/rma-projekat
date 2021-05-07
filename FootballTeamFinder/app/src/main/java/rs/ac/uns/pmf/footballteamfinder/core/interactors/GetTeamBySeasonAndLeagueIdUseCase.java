package rs.ac.uns.pmf.footballteamfinder.core.interactors;

import rs.ac.uns.pmf.footballteamfinder.core.data.TeamRepository;

public class GetTeamBySeasonAndLeagueIdUseCase extends UseCase {

    private final TeamRepository teamRepository;
    private final Integer season;
    private final Integer leagueId;

    public GetTeamBySeasonAndLeagueIdUseCase(Integer season, Integer leagueId, TeamRepository teamRepository) {
        this.season = season;
        this.leagueId = leagueId;
        this.teamRepository = teamRepository;
    }

    public void execute() {
        teamRepository.getTeamsBySeasonAndLeagueId(season, leagueId);
    }

    public TeamRepository getTeamRepository() {
        return teamRepository;
    }


}


