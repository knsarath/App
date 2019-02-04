package com.app.arch.common.di.modules;

import com.app.arch.common.di.AppViewModelFactory;
import com.app.arch.common.di.qualifiers.ViewModelKey;
import com.app.arch.presentation.viewmodel.HomeViewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {


    @Binds
    abstract ViewModelProvider.Factory vmFactory(AppViewModelFactory appViewModelFactory);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindUserViewModel(HomeViewModel userViewModel);

}

