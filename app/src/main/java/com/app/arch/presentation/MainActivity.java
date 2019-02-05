package com.app.arch.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dagger.android.AndroidInjection;

import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;

import com.app.arch.R;
import com.app.arch.common.BaseActivity;
import com.app.arch.common.Navigator;
import com.app.arch.common.di.qualifiers.AppContext;
import com.app.arch.databinding.ActivityMainBinding;
import com.app.arch.presentation.viewmodel.HomeViewModel;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    ViewModelProvider.Factory mFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        HomeViewModel viewModel = ViewModelProviders.of(this, mFactory).get(HomeViewModel.class);
        activityMainBinding.setViewModel(viewModel);


    }


}
