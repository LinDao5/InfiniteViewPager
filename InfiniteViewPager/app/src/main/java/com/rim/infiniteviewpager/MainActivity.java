package com.rim.infiniteviewpager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.rim.infiniteviewpager.Adapter.MyAdapter;
import com.rim.infiniteviewpager.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager;
    List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        horizontalInfiniteCycleViewPager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.view_pager);
        MyAdapter myAdapter = new MyAdapter(this, movieList);
        horizontalInfiniteCycleViewPager.setAdapter(myAdapter);

    }

    private void initData(){
        movieList.add(new Movie("M O Y G H F", getString(R.string.description),R.drawable.e) );
        movieList.add(new Movie("M I H G G", getString(R.string.description), R.drawable.d));
        movieList.add(new Movie("J Y G  F", getString(R.string.description), R.drawable.f));
        movieList.add(new Movie("I H G  F J", getString(R.string.description), R.drawable.g));
    }
}
