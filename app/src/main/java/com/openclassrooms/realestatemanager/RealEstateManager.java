package com.openclassrooms.realestatemanager;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

public class RealEstateManager extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
