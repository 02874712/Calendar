package com.example.calendar;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("41qdEDx3YRtr59qNkIKmjMVJqZGCPcs1VKMpd3UQ")
                .clientKey("FWhC1ggVUGsb9qJu2SeIJTbZUANq6pu7sdiQj34M")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
