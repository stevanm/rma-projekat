package rs.ac.uns.pmf.footballteamfinder.model.remote.player;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("substitutes")
    private Substitutes substitutes;
    @SerializedName("games")
    private Games games;
    @SerializedName("penalty")
    private Penalty penalty;
    @SerializedName("cards")
    private Cards cards;
    @SerializedName("fouls")
    private Fouls fouls;
    @SerializedName("dribbles")
    private Dribbles dribbles;
    @SerializedName("duels")
    private Duels duels;
    @SerializedName("tackles")
    private Tackles tackles;
    @SerializedName("passes")
    private Passes passes;
    @SerializedName("goals")
    private Goals goals;
    @SerializedName("shots")
    private Shots shots;
    @SerializedName("captain")
    private int captain;
    @SerializedName("season")
    private String season;
    @SerializedName("league")
    private String league;
    @SerializedName("team_name")
    private String teamName;
    @SerializedName("team_id")
    private int teamId;
    @SerializedName("rating")
    private String rating;
    @SerializedName("weight")
    private String weight;
    @SerializedName("height")
    private String height;
    @SerializedName("nationality")
    private String nationality;
    @SerializedName("birth_country")
    private String birthCountry;
    @SerializedName("birth_place")
    private String birthPlace;
    @SerializedName("birth_date")
    private String birthDate;
    @SerializedName("age")
    private int age;
    @SerializedName("position")
    private String position;
    @SerializedName("lastname")
    private String lastname;
    @SerializedName("firstname")
    private String firstname;
    @SerializedName("player_name")
    private String playerName;
    @SerializedName("player_id")
    private int playerId;


    @Override
    public boolean equals(@Nullable Object obj) {
        if (null != obj) {
            return ((Player) obj).getPlayerId() == this.getPlayerId();
        }
        return false;
    }

    public Substitutes getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(Substitutes substitutes) {
        this.substitutes = substitutes;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public Penalty getPenalty() {
        return penalty;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public Fouls getFouls() {
        return fouls;
    }

    public void setFouls(Fouls fouls) {
        this.fouls = fouls;
    }

    public Dribbles getDribbles() {
        return dribbles;
    }

    public void setDribbles(Dribbles dribbles) {
        this.dribbles = dribbles;
    }

    public Duels getDuels() {
        return duels;
    }

    public void setDuels(Duels duels) {
        this.duels = duels;
    }

    public Tackles getTackles() {
        return tackles;
    }

    public void setTackles(Tackles tackles) {
        this.tackles = tackles;
    }

    public Passes getPasses() {
        return passes;
    }

    public void setPasses(Passes passes) {
        this.passes = passes;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Shots getShots() {
        return shots;
    }

    public void setShots(Shots shots) {
        this.shots = shots;
    }

    public int getCaptain() {
        return captain;
    }

    public void setCaptain(int captain) {
        this.captain = captain;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
