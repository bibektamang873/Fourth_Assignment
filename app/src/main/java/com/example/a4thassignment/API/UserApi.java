package com.example.a4thassignment.API;

import android.telecom.Call;

import com.example.a4thassignment.Models.ApiUser;

public class UserApi {

    FacebookInterface fbInt = Retro.getInstance().create(FacebookInterface.class);
    boolean isLoggedIn = false;

    public boolean userLogin(ApiUser apiUser){
        Call<ApiUser> userCall = fbInt.userLogin(apiUser);
        StrictMode();
        userCall.;
    }

    private void StrictMode(){
        android.os.StrictMode.ThreadPolicy policy =
                new android.os.StrictMode.ThreadPolicy().Builder.PermitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }
