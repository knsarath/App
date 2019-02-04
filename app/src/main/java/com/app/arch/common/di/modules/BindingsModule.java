package com.app.arch.common.di.modules;

import com.app.arch.data.Repository;
import com.app.arch.data.RepositoryImpl;

import dagger.Binds;
import dagger.Module;

@Module
public interface BindingsModule {
    @Binds
    Repository bindsRepository(RepositoryImpl repository);
}
