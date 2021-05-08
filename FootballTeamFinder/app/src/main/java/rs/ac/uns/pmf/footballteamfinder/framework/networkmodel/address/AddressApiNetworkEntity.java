package rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddressApiNetworkEntity {

    @Expose
    @SerializedName("boundingbox")
    private List<String> boundingbox;
    @Expose
    @SerializedName("address")
    private AddressNetworkEntity addressNetworkEntity;
    @Expose
    @SerializedName("display_name")
    private String displayName;
    @Expose
    @SerializedName("lon")
    private String lon;
    @Expose
    @SerializedName("lat")
    private String lat;
    @Expose
    @SerializedName("osm_id")
    private double osmId;
    @Expose
    @SerializedName("osm_type")
    private String osmType;
    @Expose
    @SerializedName("licence")
    private String licence;
    @Expose
    @SerializedName("place_id")
    private int placeId;

    public List<String> getBoundingbox() {
        return boundingbox;
    }

    public AddressNetworkEntity getAddressNetworkEntity() {
        return addressNetworkEntity;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }

    public double getOsmId() {
        return osmId;
    }

    public String getOsmType() {
        return osmType;
    }

    public String getLicence() {
        return licence;
    }

    public int getPlaceId() {
        return placeId;
    }
}
