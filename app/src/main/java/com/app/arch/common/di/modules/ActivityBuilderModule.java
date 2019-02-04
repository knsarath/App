package com.app.arch.common.di.modules;

import com.app.arch.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract MainActivity bindsMainActivity();
}
