package com.app.arch.common.di.modules;

import android.app.Activity;

import com.app.arch.common.AppRouter;
import com.app.arch.common.Navigator;
import com.app.arch.presentation.MainActivity;

import dagger.Binds;
import dagger.Module;

@Module
public interface MainActivityModule {

    @Binds
    Activity bindsActivity(MainActivity mainActivity);

    @Binds
    Navigator bindsnavigator(AppRouter appRouter);
}
