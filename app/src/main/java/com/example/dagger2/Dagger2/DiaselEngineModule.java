package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.DiaselEngine;
import com.example.dagger2.Car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DiaselEngineModule {
    private int horsePower;

    public DiaselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public Engine provideEngine(){
        return new DiaselEngine(horsePower);
    }
}
