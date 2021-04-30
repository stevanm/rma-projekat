package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import com.google.gson.annotations.SerializedName;

public class Passes {

    @SerializedName("accuracy")
    private int accuracy;
    @SerializedName("key")
    private int key;
    @SerializedName("total")
    private int total;

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
