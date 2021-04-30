package rs.ac.uns.pmf.footballteamfinder.model.remote.league;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coverage implements Parcelable {

    @Expose
    @SerializedName("odds")
    private boolean odds;
    @Expose
    @SerializedName("predictions")
    private boolean predictions;
    @Expose
    @SerializedName("topScorers")
    private boolean topScorers;
    @Expose
    @SerializedName("players")
    private boolean players;
    @Expose
    @SerializedName("fixtures")
    private Fixtures fixtures;
    @Expose
    @SerializedName("standings")
    private boolean standings;

    public boolean getOdds() {
        return odds;
    }

    public void setOdds(boolean odds) {
        this.odds = odds;
    }

    public boolean getPredictions() {
        return predictions;
    }

    public void setPredictions(boolean predictions) {
        this.predictions = predictions;
    }

    public boolean getTopScorers() {
        return topScorers;
    }

    public void setTopScorers(boolean topScorers) {
        this.topScorers = topScorers;
    }

    public boolean getPlayers() {
        return players;
    }

    public void setPlayers(boolean players) {
        this.players = players;
    }

    public Fixtures getFixtures() {
        return fixtures;
    }

    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public boolean getStandings() {
        return standings;
    }

    public void setStandings(boolean standings) {
        this.standings = standings;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.odds ? (byte) 1 : (byte) 0);
        dest.writeByte(this.predictions ? (byte) 1 : (byte) 0);
        dest.writeByte(this.topScorers ? (byte) 1 : (byte) 0);
        dest.writeByte(this.players ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.fixtures, flags);
        dest.writeByte(this.standings ? (byte) 1 : (byte) 0);
    }

    public Coverage() {
    }

    protected Coverage(Parcel in) {
        this.odds = in.readByte() != 0;
        this.predictions = in.readByte() != 0;
        this.topScorers = in.readByte() != 0;
        this.players = in.readByte() != 0;
        this.fixtures = in.readParcelable(Fixtures.class.getClassLoader());
        this.standings = in.readByte() != 0;
    }

    public static final Creator<Coverage> CREATOR = new Creator<Coverage>() {
        @Override
        public Coverage createFromParcel(Parcel source) {
            return new Coverage(source);
        }

        @Override
        public Coverage[] newArray(int size) {
            return new Coverage[size];
        }
    };
}
