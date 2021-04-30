package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Duels {

    @SerializedName("won")
    private int won;
    @SerializedName("total")
    private int total;

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
