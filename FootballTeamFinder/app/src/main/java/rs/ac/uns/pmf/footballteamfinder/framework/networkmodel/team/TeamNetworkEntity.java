package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.team;

import com.google.gson.annotations.SerializedName;

public class TeamNetworkEntity {

	@SerializedName("country")
	private String country;

	@SerializedName("name")
	private String name;

	@SerializedName("founded")
	private int founded;

	@SerializedName("national")
	private boolean national;

	@SerializedName("logo")
	private String logo;

	@SerializedName("id")
	private int id;

	public String getCountry(){
		return country;
	}

	public String getName(){
		return name;
	}

	public int getFounded(){
		return founded;
	}

	public boolean isNational(){
		return national;
	}

	public String getLogo(){
		return logo;
	}

	public int getId(){
		return id;
	}
}