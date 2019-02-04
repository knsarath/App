package com.app.arch.data;

import com.app.arch.common.di.scopes.ApplicationScope;

import javax.inject.Inject;

@ApplicationScope
public class RepositoryImpl implements Repository {

    @Inject
    public RepositoryImpl() {
    }
}
