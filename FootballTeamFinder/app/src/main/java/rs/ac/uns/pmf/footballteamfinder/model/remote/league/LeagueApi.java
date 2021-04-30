package rs.ac.uns.pmf.footballteamfinder.model.remote.league;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueApi implements Parcelable {


    @Expose
    @SerializedName("api")
    private Api api;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.api, flags);
    }

    public LeagueApi() {
    }

    protected LeagueApi(Parcel in) {
        this.api = in.readParcelable(Api.class.getClassLoader());
    }

    public static final Creator<LeagueApi> CREATOR = new Creator<LeagueApi>() {
        @Override
        public LeagueApi createFromParcel(Parcel source) {
            return new LeagueApi(source);
        }

        @Override
        public LeagueApi[] newArray(int size) {
            return new LeagueApi[size];
        }
    };
}
