package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Cards {

    @SerializedName("red")
    private int red;
    @SerializedName("yellowred")
    private int yellowred;
    @SerializedName("yellow")
    private int yellow;

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellowred() {
        return yellowred;
    }

    public void setYellowred(int yellowred) {
        this.yellowred = yellowred;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }
}
