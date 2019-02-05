package com.app.arch.presentation.viewmodel;

import com.app.arch.common.Navigator;
import com.app.arch.data.Repository;

import javax.inject.Inject;

import io.reactivex.Observable;
import timber.log.Timber;

public class HomeViewModel extends BaseViewModel {

    private Repository mRepository;

    @Inject
    public HomeViewModel(Repository repository) {
        mRepository = repository;
    }

    @Inject
    protected void init() {

    }

    @Override
    public void onViewEvent(Observable<ViewEvent> eventObservable) {
        Timber.d("onViewEvent: ");
    }
}
