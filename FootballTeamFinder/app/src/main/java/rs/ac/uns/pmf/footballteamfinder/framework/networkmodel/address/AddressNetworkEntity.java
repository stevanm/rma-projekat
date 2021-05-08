package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressNetworkEntity {

    @Expose
    @SerializedName("country_code")
    private String countryCode;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("postcode")
    private String postcode;
    @Expose
    @SerializedName("state")
    private String state;
    @Expose
    @SerializedName("county")
    private String county;
    @Expose
    @SerializedName("city")
    private String city;
    @Expose
    @SerializedName("city_district")
    private String cityDistrict;
    @Expose
    @SerializedName("suburb")
    private String suburb;
    @Expose
    @SerializedName("city_block")
    private String cityBlock;
    @Expose
    @SerializedName("road")
    private String road;
    @Expose
    @SerializedName("house_number")
    private String houseNumber;
    @Expose
    @SerializedName("amenity")
    private String amenity;

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getState() {
        return state;
    }

    public String getCounty() {
        return county;
    }

    public String getCity() {
        return city;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCityBlock() {
        return cityBlock;
    }

    public String getRoad() {
        return road;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getAmenity() {
        return amenity;
    }
}
