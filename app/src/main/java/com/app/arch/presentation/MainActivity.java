package com.app.arch.presentation;

import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;

import android.content.Context;
import android.os.Bundle;

import com.app.arch.R;
import com.app.arch.common.Navigator;
import com.app.arch.common.di.qualifiers.AppContext;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    @AppContext
    Context mContext;

    @Inject
    Navigator mNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
