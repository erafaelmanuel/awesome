package io.ermdev.awesome.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.ermdev.awesome.model.Person;
import io.ermdev.awesome.model.Pet;

/**
 * Created by erafaelmanuel on 11/27/2017.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Pet providePet() {
        return new Pet("Doggy");
    }

    @Provides
    @Singleton
    Person providePerson(Pet pet) {
        return new Person("rafael", pet);
    }
}
