package com.app.arch.presentation.viewmodel;


import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import androidx.annotation.CallSuper;
import androidx.lifecycle.ViewModel;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import timber.log.Timber;

public abstract class BaseViewModel extends ViewModel {

    private CompositeDisposable mCompositeDisposable;

    private Subject<ViewEvent> mViewEventSubject = PublishSubject.create();

    protected void addToDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(disposable);
    }

    @Inject
    protected final void initClickDispatcher() {
        viewEventDispatcher(mViewEventSubject.throttleFirst(2, TimeUnit.SECONDS));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (mCompositeDisposable != null) {
            Timber.d("%s onCleared : Composite disposable disposed", this);
            mCompositeDisposable.clear();
        }
    }


    public final void click(ViewEvent viewEvent) {
        mViewEventSubject.onNext(viewEvent);
    }

    public abstract void viewEventDispatcher(Observable<ViewEvent> eventObservable);
}
