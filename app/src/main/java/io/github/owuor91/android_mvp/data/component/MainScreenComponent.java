package io.github.owuor91.android_mvp.data.component;

import dagger.Component;
import io.github.owuor91.android_mvp.data.module.MainScreenModule;
import io.github.owuor91.android_mvp.mainscreen.MainActivity;
import io.github.owuor91.android_mvp.util.CustomScope;

/**
 * Created by johnowuor on 15/06/2017.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity mainActivity);
}
