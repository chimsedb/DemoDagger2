package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.Engine;
import com.example.dagger2.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
