package com.example.dagger2.Car;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    @Inject
    public Remote() {
    }

    public void setListener(){
        Log.d("123123","enable remote");
    }
}
