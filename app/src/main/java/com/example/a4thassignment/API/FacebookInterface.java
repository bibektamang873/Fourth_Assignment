package com.example.a4thassignment.API;

import com.example.a4thassignment.Models.ApiUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface FacebookInterface {

    @GET("login")
    Call<ApiUser> userLogin(@Body ApiUser apiUser);

}
