package com.example.dagger2.Dagger2;

import com.example.dagger2.Car.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(dependencies = AppComponent.class,modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityCompenent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent compenent);

        ActivityCompenent build();
    }
}
