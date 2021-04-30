package rs.ac.uns.pmf.footballteamfinder.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static Retrofit instance;

    private NetworkService() {
    }

    public static Retrofit getNetworkService() {
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
