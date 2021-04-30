package rs.ac.uns.pmf.footballteamfinder.model.remote.teamdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @Expose
    @SerializedName("venue_capacity")
    private int venueCapacity;
    @Expose
    @SerializedName("venue_city")
    private String venueCity;
    @Expose
    @SerializedName("venue_address")
    private String venueAddress;
    @Expose
    @SerializedName("venue_surface")
    private String venueSurface;
    @Expose
    @SerializedName("venue_name")
    private String venueName;
    @Expose
    @SerializedName("founded")
    private int founded;
    @Expose
    @SerializedName("is_national")
    private boolean isNational;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("logo")
    private String logo;
    @Expose
    @SerializedName("code")
    private String code;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("team_id")
    private int teamId;

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueSurface() {
        return venueSurface;
    }

    public void setVenueSurface(String venueSurface) {
        this.venueSurface = venueSurface;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public boolean getIsNational() {
        return isNational;
    }

    public void setIsNational(boolean isNational) {
        this.isNational = isNational;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
