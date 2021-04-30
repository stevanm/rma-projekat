package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Games {

    @SerializedName("lineups")
    private int lineups;
    @SerializedName("minutes_played")
    private int minutesPlayed;
    @SerializedName("appearences")
    private int appearences;

    public int getLineups() {
        return lineups;
    }

    public void setLineups(int lineups) {
        this.lineups = lineups;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getAppearences() {
        return appearences;
    }

    public void setAppearences(int appearences) {
        this.appearences = appearences;
    }
}
