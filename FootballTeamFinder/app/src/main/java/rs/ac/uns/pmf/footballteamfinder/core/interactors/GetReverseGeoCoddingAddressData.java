package rs.ac.uns.pmf.footballteamfinder.core.interactors;

import rs.ac.uns.pmf.footballteamfinder.core.data.LocationRepository;

public class GetReverseGeoCoddingAddressData extends UseCase {

    private LocationRepository locationRepository;
    private double longitude, latitude;

    public GetReverseGeoCoddingAddressData(double longitude, double latitude, LocationRepository locationRepository) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationRepository = locationRepository;
    }

    public void execute() {
        locationRepository.getReverseGeoCoddingAddressData(longitude, latitude);
    }

    public LocationRepository getLocationRepository() {
        return locationRepository;
    }
}


