package rs.ac.uns.pmf.footballteamfinder.framework.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppMainNetworkService {

    private static Retrofit instance;

    private AppMainNetworkService() {
    }

    public static Retrofit getAppMainNetworkService() {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl("https://api-football-v1.p.rapidapi.com/")
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
