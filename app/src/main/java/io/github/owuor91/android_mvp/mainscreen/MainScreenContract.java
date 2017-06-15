package io.github.owuor91.android_mvp.mainscreen;

import java.util.List;

import io.github.owuor91.android_mvp.data.pojos.Post;

/**
 * Created by johnowuor on 15/06/2017.
 */

public interface MainScreenContract {
    interface View{
        void showPosts(List<Post> posts);
        void showError(String message);
        void showComplete();
    }

    interface Presenter{
        void loadPost();
    }
}
