package rs.ac.uns.pmf.footballteamfinder.core.interactors;

import rs.ac.uns.pmf.footballteamfinder.core.data.LeagueRepository;

public class GetLeaguesByCountryUseCase extends UseCase {

    private LeagueRepository leagueRepository;
    private String country;

    public GetLeaguesByCountryUseCase(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public void execute() {
        leagueRepository.getLeaguesByCountryName(country);
    }

    public LeagueRepository getLeagueRepository() {
        return leagueRepository;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


