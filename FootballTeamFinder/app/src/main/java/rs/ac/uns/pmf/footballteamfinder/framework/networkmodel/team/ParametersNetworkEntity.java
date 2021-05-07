package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.team;

import com.google.gson.annotations.SerializedName;

public class ParametersNetworkEntity {

	@SerializedName("search")
	private String search;

	public String getSearch(){
		return search;
	}
}