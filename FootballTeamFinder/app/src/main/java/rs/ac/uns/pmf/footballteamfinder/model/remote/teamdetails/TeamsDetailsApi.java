package rs.ac.uns.pmf.footballteamfinder.model.remote.teamdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamsDetailsApi {

    @Expose
    @SerializedName("api")
    private Api api;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }
}
