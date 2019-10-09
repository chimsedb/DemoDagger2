package com.example.dagger2.Car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.Dagger2.ActivityCompenent;
import com.example.dagger2.Dagger2.DaggerActivityCompenent;
import com.example.dagger2.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompenent carComponent = DaggerActivityCompenent.builder()
                .horsePower(100)
                .engineCapacity(1400)
                .appComponent(((ExpampleApp) getApplication()).getCarComponent())
                .build();
        carComponent.inject(this);

        car1.drive();
        car2.drive();
    }
}
