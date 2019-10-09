package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getdriver();
}
