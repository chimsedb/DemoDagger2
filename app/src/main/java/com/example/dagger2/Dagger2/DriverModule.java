package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
    Driver provideDriver() {
        return new Driver();
    }
}
