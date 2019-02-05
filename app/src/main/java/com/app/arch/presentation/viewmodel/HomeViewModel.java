package com.app.arch.presentation.viewmodel;

import android.util.Log;

import com.app.arch.common.Navigator;
import com.app.arch.data.Repository;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;
import timber.log.Timber;

public class HomeViewModel extends BaseViewModel {

    private Repository mRepository;

    @Inject
    public HomeViewModel(Repository repository) {
        mRepository = repository;
    }


    @Override
    public void viewEventDispatcher(Observable<ViewEvent> eventObservable) {

    }
}
