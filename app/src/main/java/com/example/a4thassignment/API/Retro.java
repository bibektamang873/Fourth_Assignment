package com.example.a4thassignment.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro {

    private static final String BaseURL = "adknlkasd";
    private static final String ImageUrl = "ajlsnlk";

    public static Retrofit getInstance() {
        ///retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return  retrofit;
    }
}
