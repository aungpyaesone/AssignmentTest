package com.example.assignmenttest.network;

import com.example.assignmenttest.data.CurrencyResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ClientApi {
    @GET("latest")
    Call<CurrencyResponse> getCurrencyResponse();
}
