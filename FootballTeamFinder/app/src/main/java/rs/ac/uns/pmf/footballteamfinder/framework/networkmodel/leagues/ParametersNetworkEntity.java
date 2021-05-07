package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leagues;

import com.google.gson.annotations.SerializedName;

public class ParametersNetworkEntity {

	@SerializedName("country")
	private String country;

	public String getCountry() {
		return country;
	}
}