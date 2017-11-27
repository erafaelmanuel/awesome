package io.ermdev.awesome.di;

import javax.inject.Singleton;

import dagger.Component;
import io.ermdev.awesome.ui.main.MainActivity;

/**
 * Created by erafaelmanuel on 11/27/2017.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
