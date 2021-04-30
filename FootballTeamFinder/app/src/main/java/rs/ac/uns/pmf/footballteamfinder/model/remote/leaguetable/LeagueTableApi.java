package rs.ac.uns.pmf.footballteamfinder.model.remote.leaguetable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueTableApi {

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
