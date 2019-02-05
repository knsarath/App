package com.app.arch.presentation.viewmodel;



import androidx.lifecycle.ViewModel;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import timber.log.Timber;

public abstract class BaseViewModel extends ViewModel {

    CompositeDisposable mCompositeDisposable;

    private Subject<ViewEvent> mViewEventSubject = PublishSubject.create();

    protected void addToDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(disposable);
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

    public abstract void onViewEvent(Observable<ViewEvent> eventObservable);
}
