package rs.ac.uns.pmf.footballteamfinder.core.domain;

public class League {

    private String name;

    private String logo;

    private String type;

    public League(String name, String logo, String type) {
        this.name = name;
        this.logo = logo;
        this.type = type;
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

    @Override
    public String toString() {
        return "League{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
