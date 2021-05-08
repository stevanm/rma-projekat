package rs.ac.uns.pmf.footballteamfinder.framework.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppLocationNetworkService {

    private static Retrofit instance;

    private AppLocationNetworkService() {
    }

    public static Retrofit getAppLocationNetworkService() {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl("https://nominatim.openstreetmap.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(
                            new OkHttpClient.Builder()
                                    .addInterceptor(new HttpLoggingInterceptor()
                                            .setLevel(HttpLoggingInterceptor.Level.BASIC))
                                    .build()
                    )
                    .build();
        }
        return instance;
    }
}
