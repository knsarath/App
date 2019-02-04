package com.app.arch.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseViewModel extends ViewModel {

    CompositeDisposable mCompositeDisposable;

    protected void addToDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(disposable);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }
}
