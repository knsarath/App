package com.app.arch.common;

import android.content.Context;

import com.app.arch.App;
import com.app.arch.common.di.modules.AppModule;
import com.app.arch.common.di.modules.ActivityBuilderModule;
import com.app.arch.common.di.modules.BindingsModule;
import com.app.arch.common.di.modules.ViewModelModule;
import com.app.arch.common.di.qualifiers.AppContext;
import com.app.arch.common.di.scopes.ApplicationScope;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@ApplicationScope
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBuilderModule.class,
        AppModule.class,
        ViewModelModule.class,
        BindingsModule.class
})
public interface AppComponent {

    void inject(App app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder setApp(App app);

        @BindsInstance
        Builder setAppContext(@AppContext Context appContext);

        AppComponent build();
    }
}
