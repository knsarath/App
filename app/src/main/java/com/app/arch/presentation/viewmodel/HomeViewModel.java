package com.app.arch.presentation.viewmodel;

import android.util.Log;

import com.app.arch.common.Navigator;
import com.app.arch.data.Repository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class HomeViewModel extends BaseViewModel {

    private Repository mRepository;
    private Navigator mNavigator;

    @Inject
    public HomeViewModel(Repository repository, Navigator navigator) {
        mRepository = repository;
        mNavigator = navigator;
    }


    @Override
    public void viewEventDispatcher(Observable<ViewEvent> eventObservable) {

    }
}
