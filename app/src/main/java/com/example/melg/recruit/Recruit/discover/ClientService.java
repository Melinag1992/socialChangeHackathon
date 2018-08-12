package com.example.melg.recruit.Recruit.discover;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientService {
    private Retrofit retrofit;
    public ClientService(@NonNull String domain) {
        retrofit = new Retrofit.Builder()
                .baseUrl(domain)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @NonNull
    public ApiNode getApi() {
        return retrofit.create(ApiNode.class);
    }


}