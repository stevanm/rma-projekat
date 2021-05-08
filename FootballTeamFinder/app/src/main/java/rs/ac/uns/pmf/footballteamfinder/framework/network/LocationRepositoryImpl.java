package rs.ac.uns.pmf.footballteamfinder.framework.network;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rs.ac.uns.pmf.footballteamfinder.core.data.LocationRepository;
import rs.ac.uns.pmf.footballteamfinder.core.domain.Address;
import rs.ac.uns.pmf.footballteamfinder.core.mappers.AddressMapper;
import rs.ac.uns.pmf.footballteamfinder.framework.networkmodel.address.AddressApiNetworkEntity;

public class LocationRepositoryImpl implements LocationRepository {

    public static final String TAG = LocationRepositoryImpl.class.getSimpleName();

    private final AddressMapper addressMapper;

    private final MutableLiveData<Address> mAddress = new MutableLiveData<>();
    public LiveData<Address> address = mAddress;

    public LocationRepositoryImpl(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public void getReverseGeoCoddingAddressData(double longitude, double latitude) {
        Call<AddressApiNetworkEntity> call = AppLocationNetworkService.getAppLocationNetworkService().create(AppLocationApi.class).getReverseGeoCoddingAddressData(longitude, latitude);
        call.enqueue(new Callback<AddressApiNetworkEntity>() {
            @Override
            public void onResponse(Call<AddressApiNetworkEntity> call, Response<AddressApiNetworkEntity> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Address addresses = addressMapper.mapFromEntity(response.body().getAddressNetworkEntity());
                        mAddress.postValue(addresses);
                    }
                } else {
                    Log.d(TAG, "onResponse: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<AddressApiNetworkEntity> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t);
            }
        });
    }
}
