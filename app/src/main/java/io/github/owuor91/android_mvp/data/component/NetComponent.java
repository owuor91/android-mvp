package io.github.owuor91.android_mvp.data.component;

import javax.inject.Singleton;

import dagger.Component;
import io.github.owuor91.android_mvp.data.module.AppModule;
import io.github.owuor91.android_mvp.data.module.NetModule;
import retrofit2.Retrofit;

/**
 * Created by johnowuor on 15/06/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
