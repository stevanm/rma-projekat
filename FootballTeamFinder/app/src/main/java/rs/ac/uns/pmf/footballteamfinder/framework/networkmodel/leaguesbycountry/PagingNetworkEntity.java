package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leaguesbycountry;

import com.google.gson.annotations.SerializedName;

public class PagingNetworkEntity {

	@SerializedName("current")
	private int current;

	@SerializedName("total")
	private int total;

	public int getCurrent() {
		return current;
	}

	public int getTotal() {
		return total;
	}
}