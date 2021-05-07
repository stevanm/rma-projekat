package rs.ac.uns.pmf.footballteamfinder.core.domain;

public class League {

    private int id;

    private String name;

    private String logo;

    private String type;

    private String country;

    public League(int id, String name, String logo, String type, String country) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.type = type;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "League {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                " }";
    }
}
