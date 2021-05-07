package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel._teamstatistics;

import com.google.gson.annotations.SerializedName;

public class TeamStatisticsItemNetworkEntity {

	@SerializedName("venue")
	private VenueNetworkEntity venueNetworkEntity;

	@SerializedName("team")
	private TeamNetworkEntity teamNetworkEntity;

	public VenueNetworkEntity getVenueNetworkEntity() {
		return venueNetworkEntity;
	}

	public TeamNetworkEntity getTeamNetworkEntity() {
		return teamNetworkEntity;
	}
}