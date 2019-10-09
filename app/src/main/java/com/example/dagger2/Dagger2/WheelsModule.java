package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.Rims;
import com.example.dagger2.Car.Tires;
import com.example.dagger2.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    public Rims provideRims(){
        return new Rims();
    }

    @Provides
    public Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    public Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels();
    }
}
