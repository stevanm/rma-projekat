package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel._teamstatistics;

import com.google.gson.annotations.SerializedName;

public class VenueNetworkEntity {

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("surface")
	private String surface;

	@SerializedName("city")
	private String city;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("capacity")
	private int capacity;

	public String getImage() {
		return image;
	}

	public String getAddress() {
		return address;
	}

	public String getSurface() {
		return surface;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getCapacity() {
		return capacity;
	}
}