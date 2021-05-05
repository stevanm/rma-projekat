package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leaguesbycountry;

import com.google.gson.annotations.SerializedName;

public class CoverageNetworkEntity {

	@SerializedName("top_cards")
	private boolean topCards;

	@SerializedName("injuries")
	private boolean injuries;

	@SerializedName("players")
	private boolean players;

	@SerializedName("odds")
	private boolean odds;

	@SerializedName("top_assists")
	private boolean topAssists;

	@SerializedName("standings")
	private boolean standings;

	@SerializedName("top_scorers")
	private boolean topScorers;

	@SerializedName("predictions")
	private boolean predictions;

	@SerializedName("fixtures")
	private FixturesNetworkEntity fixturesNetworkEntity;

	public boolean isTopCards() {
		return topCards;
	}

	public boolean isInjuries() {
		return injuries;
	}

	public boolean isPlayers() {
		return players;
	}

	public boolean isOdds() {
		return odds;
	}

	public boolean isTopAssists() {
		return topAssists;
	}

	public boolean isStandings() {
		return standings;
	}

	public boolean isTopScorers() {
		return topScorers;
	}

	public boolean isPredictions() {
		return predictions;
	}

	public FixturesNetworkEntity getFixturesNetworkEntity() {
		return fixturesNetworkEntity;
	}
}