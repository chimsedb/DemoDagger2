package com.example.dagger2.Car;

import android.util.Log;

import com.example.dagger2.Dagger2.PerActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Car {
    @Inject Driver driver;
    @Inject Engine engine;
    @Inject Wheels wheels;

//    @Inject
//    public Car(Engine engine, Wheels wheels) {
//        this.engine = engine;
//        this.wheels = wheels;
//    }
    @Inject
    public Car() {

    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener();
    }

    public void drive(){
        engine.start();
        Log.d("123123",driver + " driving... "+this);
//        Log.d("123123",  " driving... "+this);
    }

}
