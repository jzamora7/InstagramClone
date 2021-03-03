package com.example.unit5project;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ohcUCc8w9GgKnQi19vAQJmulj6lZyRVolkIaWfgm")
                .clientKey("L6dFqjm5arwCDYzvrDzT5mHijzWVxwGDVl3aEhls")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
