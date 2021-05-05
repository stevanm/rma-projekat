package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.leaguesbycountry;

import com.google.gson.annotations.SerializedName;

public class SeasonsItemNetworkEntity {

	@SerializedName("coverage")
	private CoverageNetworkEntity coverageNetworkEntity;

	@SerializedName("current")
	private boolean current;

	@SerializedName("year")
	private int year;

	@SerializedName("start")
	private String start;

	@SerializedName("end")
	private String end;

	public CoverageNetworkEntity getCoverageNetworkEntity() {
		return coverageNetworkEntity;
	}

	public boolean isCurrent() {
		return current;
	}

	public int getYear() {
		return year;
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}
}