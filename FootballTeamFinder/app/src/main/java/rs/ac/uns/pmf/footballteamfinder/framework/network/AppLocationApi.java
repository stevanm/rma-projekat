package rs.ac.uns.pmf.footballteamfinder.framework.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.address.AddressApiNetworkEntity;

public interface AppLocationApi {

    // reverse geo-codding
    @Headers({
            "Accept-Language:en-US"
    })
    @GET("reverse?format=json")
    Call<AddressApiNetworkEntity> getReverseGeoCoddingAddressData(
            @Query("lon") double longitude,
            @Query("lat") double latitude
    );

}
