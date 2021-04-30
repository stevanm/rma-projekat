package rs.ac.uns.pmf.footballteamfinder.model.remote.teamdetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Api {

    @Expose
    @SerializedName("teams")
    private List<Team> teams;
    @Expose
    @SerializedName("results")
    private int results;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }
}
