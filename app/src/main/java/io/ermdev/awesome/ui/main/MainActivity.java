package io.ermdev.awesome.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;

import io.ermdev.awesome.R;
import io.ermdev.awesome.model.Person;
import io.ermdev.awesome.ui.BaseActivity;

/**
 * Created by erafaelmanuel on 11/27/2017.
 */
public class MainActivity extends BaseActivity {

    @Inject
    Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAppComponent().inject(this);

        TextView textView = (TextView) findViewById(R.id.name);
        textView.setText("Hello to " + person.getName() + " and his pet " + person.getPet().getName());
    }
}
