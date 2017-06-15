package io.github.owuor91.android_mvp.data.module;

import dagger.Module;
import dagger.Provides;
import io.github.owuor91.android_mvp.mainscreen.MainScreenContract;
import io.github.owuor91.android_mvp.util.CustomScope;

/**
 * Created by johnowuor on 15/06/2017.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View view;

    public MainScreenModule(MainScreenContract.View view) {
        this.view = view;
    }


    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView(){
        return view;
    }

}
