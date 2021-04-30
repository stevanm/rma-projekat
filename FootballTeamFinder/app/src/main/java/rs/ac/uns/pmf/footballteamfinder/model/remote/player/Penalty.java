package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Penalty {

    @SerializedName("saved")
    private int saved;
    @SerializedName("missed")
    private int missed;
    @SerializedName("success")
    private int success;
    @SerializedName("commited")
    private int commited;
    @SerializedName("won")
    private int won;

    public int getSaved() {
        return saved;
    }

    public void setSaved(int saved) {
        this.saved = saved;
    }

    public int getMissed() {
        return missed;
    }

    public void setMissed(int missed) {
        this.missed = missed;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getCommited() {
        return commited;
    }

    public void setCommited(int commited) {
        this.commited = commited;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }
}
