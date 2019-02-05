package com.app.arch.common.di.modules;

import com.app.arch.common.di.scopes.ActivityScope;
import com.app.arch.presentation.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, ViewModelModule.class})
    @ActivityScope
    abstract MainActivity bindsMainActivity();
}
