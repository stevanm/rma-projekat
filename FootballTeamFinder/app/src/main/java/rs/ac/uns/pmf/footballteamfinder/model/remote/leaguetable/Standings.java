package rs.ac.uns.pmf.footballteamfinder.model.remote.leaguetable;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standings implements Parcelable {

    @Expose
    @SerializedName("lastUpdate")
    private String lastUpdate;
    @Expose
    @SerializedName("group")
    private String group;
    @Expose
    @SerializedName("points")
    private Long points;
    @Expose
    @SerializedName("goalsDiff")
    private String goalsDiff;
    @Expose
    @SerializedName("goalsAgainst")
    private String goalsAgainst;
    @Expose
    @SerializedName("goalsFor")
    private String goalsFor;
    @Expose
    @SerializedName("lose")
    private Long lose;
    @Expose
    @SerializedName("draw")
    private String draw;
    @Expose
    @SerializedName("win")
    private Long win;
    @Expose
    @SerializedName("matchsPlayed")
    private Long matchsPlayed;
    @Expose
    @SerializedName("teamName")
    private String teamName;
    @Expose
    @SerializedName("team_id")
    private Long teamId;
    @Expose
    @SerializedName("rank")
    private Long rank;

    private Bitmap logoImage;

    public Standings() {
    }

    public Standings(Long teamId, Long rank, String teamName, Long matchsPlayed, Long win, String draw, Long lose, String goalsFor, String goalsAgainst, String goalsDiff, Long points, String group, String lastUpdate, Bitmap logoImage) {
        this.teamId = teamId;
        this.rank = rank;
        this.teamName = teamName;
        this.matchsPlayed = matchsPlayed;
        this.win = win;
        this.draw = draw;
        this.lose = lose;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalsDiff = goalsDiff;
        this.points = points;
        this.group = group;
        this.lastUpdate = lastUpdate;
        this.logoImage = logoImage;
    }


    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getGoalsDiff() {
        return goalsDiff;
    }

    public void setGoalsDiff(String goalsDiff) {
        this.goalsDiff = goalsDiff;
    }

    public String getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(String goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public String getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(String goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Long getLose() {
        return lose;
    }

    public void setLose(Long lose) {
        this.lose = lose;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public Long getWin() {
        return win;
    }

    public void setWin(Long win) {
        this.win = win;
    }

    public Long getMatchsPlayed() {
        return matchsPlayed;
    }

    public void setMatchsPlayed(Long matchsPlayed) {
        this.matchsPlayed = matchsPlayed;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Bitmap getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(Bitmap logoImage) {
        this.logoImage = logoImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.lastUpdate);
        dest.writeString(this.group);
        dest.writeValue(this.points);
        dest.writeString(this.goalsDiff);
        dest.writeString(this.goalsAgainst);
        dest.writeString(this.goalsFor);
        dest.writeValue(this.lose);
        dest.writeString(this.draw);
        dest.writeValue(this.win);
        dest.writeValue(this.matchsPlayed);
        dest.writeString(this.teamName);
        dest.writeValue(this.teamId);
        dest.writeValue(this.rank);
        dest.writeParcelable(this.logoImage, flags);
    }

    protected Standings(Parcel in) {
        this.lastUpdate = in.readString();
        this.group = in.readString();
        this.points = (Long) in.readValue(Long.class.getClassLoader());
        this.goalsDiff = in.readString();
        this.goalsAgainst = in.readString();
        this.goalsFor = in.readString();
        this.lose = (Long) in.readValue(Long.class.getClassLoader());
        this.draw = in.readString();
        this.win = (Long) in.readValue(Long.class.getClassLoader());
        this.matchsPlayed = (Long) in.readValue(Long.class.getClassLoader());
        this.teamName = in.readString();
        this.teamId = (Long) in.readValue(Long.class.getClassLoader());
        this.rank = (Long) in.readValue(Long.class.getClassLoader());
        this.logoImage = in.readParcelable(Bitmap.class.getClassLoader());
    }

    public static final Creator<Standings> CREATOR = new Creator<Standings>() {
        @Override
        public Standings createFromParcel(Parcel source) {
            return new Standings(source);
        }

        @Override
        public Standings[] newArray(int size) {
            return new Standings[size];
        }
    };
}
