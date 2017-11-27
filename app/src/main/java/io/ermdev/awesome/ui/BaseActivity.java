package io.ermdev.awesome.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.ermdev.awesome.di.AppComponent;
import io.ermdev.awesome.di.AppModule;
import io.ermdev.awesome.di.DaggerAppComponent;

/**
 * Created by erafaelmanuel on 11/27/2017.
 */

public class BaseActivity extends AppCompatActivity {

    private AppComponent appComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
