package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues;

import com.google.gson.annotations.SerializedName;

public class LeagueNetworkEntity {

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private String logo;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	public String getName() {
		return name;
	}

	public String getLogo() {
		return logo;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}
}