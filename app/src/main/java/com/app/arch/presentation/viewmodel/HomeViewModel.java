package com.app.arch.presentation.viewmodel;

import com.app.arch.common.Navigator;

import javax.inject.Inject;

public class HomeViewModel extends BaseViewModel {

    private Navigator mNavigator;

    @Inject
    public HomeViewModel(Navigator navigator) {
        mNavigator = navigator;
    }
}
