package io.github.owuor91.android_mvp;

import android.app.Application;

import io.github.owuor91.android_mvp.data.component.DaggerNetComponent;
import io.github.owuor91.android_mvp.data.component.NetComponent;
import io.github.owuor91.android_mvp.data.module.AppModule;
import io.github.owuor91.android_mvp.data.module.NetModule;

/**
 * Created by johnowuor on 15/06/2017.
 */

public class App extends Application {
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent(){
        return netComponent;
    }
}
