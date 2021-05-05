package rs.ac.uns.pmf.footballteamfinder.core.interactors;

public class Interactors {

    private GetLeaguesByCountryUseCase getLeaguesByCountryUseCase;

    public Interactors(GetLeaguesByCountryUseCase getLeaguesByCountryUseCase) {
        this.getLeaguesByCountryUseCase = getLeaguesByCountryUseCase;
    }

    public GetLeaguesByCountryUseCase getGetLeaguesByCountryUseCase() {
        return getLeaguesByCountryUseCase;
    }

}
