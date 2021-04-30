package rs.ac.uns.pmf.footballteamfinder.model.remote.league;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fixtures implements Parcelable {

    @Expose
    @SerializedName("players_statistics")
    private boolean playersStatistics;
    @Expose
    @SerializedName("statistics")
    private boolean statistics;
    @Expose
    @SerializedName("lineups")
    private boolean lineups;
    @Expose
    @SerializedName("events")
    private boolean events;

    public boolean getPlayersStatistics() {
        return playersStatistics;
    }

    public void setPlayersStatistics(boolean playersStatistics) {
        this.playersStatistics = playersStatistics;
    }

    public boolean getStatistics() {
        return statistics;
    }

    public void setStatistics(boolean statistics) {
        this.statistics = statistics;
    }

    public boolean getLineups() {
        return lineups;
    }

    public void setLineups(boolean lineups) {
        this.lineups = lineups;
    }

    public boolean getEvents() {
        return events;
    }

    public void setEvents(boolean events) {
        this.events = events;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.playersStatistics ? (byte) 1 : (byte) 0);
        dest.writeByte(this.statistics ? (byte) 1 : (byte) 0);
        dest.writeByte(this.lineups ? (byte) 1 : (byte) 0);
        dest.writeByte(this.events ? (byte) 1 : (byte) 0);
    }

    public Fixtures() {
    }

    protected Fixtures(Parcel in) {
        this.playersStatistics = in.readByte() != 0;
        this.statistics = in.readByte() != 0;
        this.lineups = in.readByte() != 0;
        this.events = in.readByte() != 0;
    }

    public static final Creator<Fixtures> CREATOR = new Creator<Fixtures>() {
        @Override
        public Fixtures createFromParcel(Parcel source) {
            return new Fixtures(source);
        }

        @Override
        public Fixtures[] newArray(int size) {
            return new Fixtures[size];
        }
    };
}
