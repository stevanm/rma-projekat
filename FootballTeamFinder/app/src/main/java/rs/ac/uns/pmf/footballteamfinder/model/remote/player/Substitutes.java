package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Substitutes {

    @SerializedName("bench")
    private int bench;
    @SerializedName("out")
    private int out;
    @SerializedName("in")
    private int in;

    public int getBench() {
        return bench;
    }

    public void setBench(int bench) {
        this.bench = bench;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }
}
