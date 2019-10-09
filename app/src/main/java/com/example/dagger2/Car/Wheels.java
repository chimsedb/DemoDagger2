package com.example.dagger2.Car;

import javax.inject.Inject;

public class Wheels {

    @Inject Rims rims;
    @Inject Tires tires;

    @Inject
    public Wheels() {
    }
}
