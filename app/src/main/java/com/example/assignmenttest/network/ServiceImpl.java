package com.example.assignmenttest.network;

import android.widget.Toast;

import com.example.assignmenttest.BuildConfig;
import com.example.assignmenttest.utils.AppConstats;
import com.example.assignmenttest.data.CurrencyResponse;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceImpl implements DataAgent {

    private final ClientApi api;

    public ServiceImpl() {
        final OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout(AppConstats.CONNECTION_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(AppConstats.WRITE_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(AppConstats.READ_TIME_OUT, TimeUnit.SECONDS);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
             okHttpClientBuilder.addInterceptor(logging);
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstats.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClientBuilder.build())
                .build();


        api = retrofit.create(ClientApi.class);

    }

    @Override
    public void getData() {
        Call<CurrencyResponse> getCurrencyResponse = api.getCurrencyResponse();
        getCurrencyResponse.enqueue(new Callback<CurrencyResponse>() {
            @Override
            public void onResponse(Call<CurrencyResponse> call, Response<CurrencyResponse> response) {
                if(response.isSuccessful()){
                    CurrencyResponse currencyData = response.body();
                    if(currencyData != null)
                    {
                        EventBus.getDefault().postSticky(currencyData);
                    }
                }
                else {
                    EventBus.getDefault().postSticky(response.message());
                }

            }

            @Override
            public void onFailure(Call<CurrencyResponse> call, Throwable t) {
                EventBus.getDefault().postSticky(t.getMessage());

            }
        });
    }
}
