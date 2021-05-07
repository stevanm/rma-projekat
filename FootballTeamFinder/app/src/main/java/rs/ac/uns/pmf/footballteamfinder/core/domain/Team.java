package rs.ac.uns.pmf.footballteamfinder.core.domain;

public class Team {

    private int id;

    private String logo;

    private String country;

    private String city;

    private String name;

    private int founded;

    public Team(int id, String logo, String country, String city, String name, int founded) {
        this.id = id;
        this.logo = logo;
        this.country = country;
        this.city = city;
        this.name = name;
        this.founded = founded;
    }

    public int getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getFounded() {
        return founded;
    }

    @Override
    public String toString() {
        return "Team {" +
                "id=" + id +
                ", logo='" + logo + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", founded=" + founded +
                " }";
    }
}
