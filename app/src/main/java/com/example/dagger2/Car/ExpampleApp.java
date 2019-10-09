package com.example.dagger2.Car;

import android.app.Application;

import com.example.dagger2.Dagger2.AppComponent;
import com.example.dagger2.Dagger2.DaggerAppComponent;

public class ExpampleApp extends Application {

    private AppComponent compenent;

    @Override
    public void onCreate() {
        super.onCreate();

        compenent = DaggerAppComponent.create();

    }

    public AppComponent getCarComponent(){
        return compenent;
    }
}
