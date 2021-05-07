package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeagueItemNetworkEntity {

	@SerializedName("country")
	private CountryNetworkEntity countryNetworkEntity;

	@SerializedName("seasons")
	private List<SeasonsItemNetworkEntity> seasons;

	@SerializedName("league")
	private LeagueNetworkEntity leagueNetworkEntity;

	public CountryNetworkEntity getCountryNetworkEntity() {
		return countryNetworkEntity;
	}

	public List<SeasonsItemNetworkEntity> getSeasons() {
		return seasons;
	}

	public LeagueNetworkEntity getLeagueNetworkEntity() {
		return leagueNetworkEntity;
	}
}