package rs.ac.uns.pmf.footballteamfinder.model.remote.league;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Api implements Parcelable {

    @Expose
    @SerializedName("leagues")
    private List<League> leagues;
    @Expose
    @SerializedName("results")
    private int results;

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.leagues);
        dest.writeInt(this.results);
    }

    public Api() {
    }

    protected Api(Parcel in) {
        this.leagues = in.createTypedArrayList(League.CREATOR);
        this.results = in.readInt();
    }

    public static final Creator<Api> CREATOR = new Creator<Api>() {
        @Override
        public Api createFromParcel(Parcel source) {
            return new Api(source);
        }

        @Override
        public Api[] newArray(int size) {
            return new Api[size];
        }
    };
}
