package com.app.arch.common;

import android.app.Activity;

import com.app.arch.common.di.scopes.ActivityScope;

import javax.inject.Inject;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;

public class AppRouter implements Navigator {

    private Activity mActivity;

    @Inject
    public AppRouter(Activity activity) {
        mActivity = activity;

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void clear(){
        mActivity = null;
    }
}
