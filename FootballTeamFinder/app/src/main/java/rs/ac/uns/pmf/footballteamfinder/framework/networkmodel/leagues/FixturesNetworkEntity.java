package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues;

import com.google.gson.annotations.SerializedName;

public class FixturesNetworkEntity {

	@SerializedName("statistics_fixtures")
	private boolean statisticsFixtures;

	@SerializedName("statistics_players")
	private boolean statisticsPlayers;

	@SerializedName("events")
	private boolean events;

	@SerializedName("lineups")
	private boolean lineups;

	public boolean isStatisticsFixtures() {
		return statisticsFixtures;
	}

	public boolean isStatisticsPlayers() {
		return statisticsPlayers;
	}

	public boolean isEvents() {
		return events;
	}

	public boolean isLineups() {
		return lineups;
	}
}