package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel._teamstatistics;

import com.google.gson.annotations.SerializedName;

public class ParametersNetworkEntity {

	@SerializedName("league")
	private String league;

	@SerializedName("season")
	private String season;

	public String getLeague() {
		return league;
	}

	public String getSeason() {
		return season;
	}
}