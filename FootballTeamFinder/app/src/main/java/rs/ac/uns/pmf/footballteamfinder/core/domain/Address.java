package rs.ac.uns.pmf.footballteamfinder.core.domain;

public class Address {

    private String country;

    private String state;

    private String county;

    public Address(String country, String state, String county) {
        this.country = country;
        this.state = state;
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCounty() {
        return county;
    }

    @Override
    public String toString() {
        return "Address {" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", county='" + county + '\'' +
                " }";
    }

}
