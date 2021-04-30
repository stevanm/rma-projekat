package rs.ac.uns.pmf.footballteamfinder.model.remote.league;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class League implements Parcelable {

    @Expose
    @SerializedName("coverage")
    private Coverage coverage;
    @Expose
    @SerializedName("is_current")
    private int isCurrent;
    @Expose
    @SerializedName("standings")
    private int standings;
    @Expose
    @SerializedName("flag")
    private String flag;
    @Expose
    @SerializedName("logo")
    private String logo;
    @Expose
    @SerializedName("season_end")
    private String seasonEnd;
    @Expose
    @SerializedName("season_start")
    private String seasonStart;
    @Expose
    @SerializedName("season")
    private int season;
    @Expose
    @SerializedName("country_code")
    private String countryCode;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("type")
    private String type;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("league_id")
    private int leagueId;

    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    public int getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(int isCurrent) {
        this.isCurrent = isCurrent;
    }

    public int getStandings() {
        return standings;
    }

    public void setStandings(int standings) {
        this.standings = standings;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public String getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.coverage, flags);
        dest.writeInt(this.isCurrent);
        dest.writeInt(this.standings);
        dest.writeString(this.flag);
        dest.writeString(this.logo);
        dest.writeString(this.seasonEnd);
        dest.writeString(this.seasonStart);
        dest.writeInt(this.season);
        dest.writeString(this.countryCode);
        dest.writeString(this.country);
        dest.writeString(this.type);
        dest.writeString(this.name);
        dest.writeInt(this.leagueId);
    }

    public League() {
    }

    protected League(Parcel in) {
        this.coverage = in.readParcelable(Coverage.class.getClassLoader());
        this.isCurrent = in.readInt();
        this.standings = in.readInt();
        this.flag = in.readString();
        this.logo = in.readString();
        this.seasonEnd = in.readString();
        this.seasonStart = in.readString();
        this.season = in.readInt();
        this.countryCode = in.readString();
        this.country = in.readString();
        this.type = in.readString();
        this.name = in.readString();
        this.leagueId = in.readInt();
    }

    public static final Creator<League> CREATOR = new Creator<League>() {
        @Override
        public League createFromParcel(Parcel source) {
            return new League(source);
        }

        @Override
        public League[] newArray(int size) {
            return new League[size];
        }
    };
}
