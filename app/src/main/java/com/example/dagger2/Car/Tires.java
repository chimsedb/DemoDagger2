package com.example.dagger2.Car;

import android.util.Log;

import javax.inject.Inject;

public class Tires {
    @Inject
    public Tires() {
    }

    public void inflate(){
        Log.d("123123","tires inflated");
    }
}
