package com.example.melg.recruit.Recruit.discover;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiNode {

    //https://diversityhiring.mybluemix.net/home
    @POST("home")
    Call<Object> postRequest();

}
