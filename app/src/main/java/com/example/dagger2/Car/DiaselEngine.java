package com.example.dagger2.Car;

import android.util.Log;

import javax.inject.Inject;

public class DiaselEngine implements Engine {
    private int horsePower;

    public DiaselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("123123", "Diasel Engine started ... horsePower : " + horsePower);
//        Log.d("123123", "Diasel Engine started ... horsePower : " );
    }
}
