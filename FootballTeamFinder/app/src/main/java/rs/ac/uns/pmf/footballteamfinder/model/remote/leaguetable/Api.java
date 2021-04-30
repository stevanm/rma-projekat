package rs.ac.uns.pmf.footballteamfinder.model.remote.leaguetable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Api {

    @Expose
    @SerializedName("standings")
    private List<List<Standings>> standings;
    @Expose
    @SerializedName("results")
    private int results;

    public List<List<Standings>> getStandings() {
        return standings;
    }

    public void setStandings(List<List<Standings>> standings) {
        this.standings = standings;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }
}
