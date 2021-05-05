package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leaguesbycountry;

import com.google.gson.annotations.SerializedName;

public class CountryNetworkEntity {

	@SerializedName("code")
	private String code;

	@SerializedName("flag")
	private String flag;

	@SerializedName("name")
	private String name;

	public String getCode() {
		return code;
	}

	public String getFlag() {
		return flag;
	}

	public String getName() {
		return name;
	}
}