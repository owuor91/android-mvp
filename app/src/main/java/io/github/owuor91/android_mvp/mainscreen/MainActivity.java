package io.github.owuor91.android_mvp.mainscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.github.owuor91.android_mvp.App;
import io.github.owuor91.android_mvp.R;
import io.github.owuor91.android_mvp.data.component.DaggerMainScreenComponent;
import io.github.owuor91.android_mvp.data.module.MainScreenModule;
import io.github.owuor91.android_mvp.data.pojos.Post;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View{
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Inject
    MainScreenPresenter mainScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.my_list);
        list = new ArrayList<String>();

        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);

        mainScreenPresenter.loadPost();
    }

    @Override
    public void showPosts(List<Post> posts) {
        for (Post post : posts){
            list.add(post.getTitle());
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), "Error" + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showComplete() {

    }
}
