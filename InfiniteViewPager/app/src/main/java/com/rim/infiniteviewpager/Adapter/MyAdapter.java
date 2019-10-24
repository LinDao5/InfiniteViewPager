package com.rim.infiniteviewpager.Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.viewpager.widget.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rim.infiniteviewpager.R;
import com.rim.infiniteviewpager.model.Movie;

import java.util.List;

public class MyAdapter extends PagerAdapter {

    Context context;
    List<Movie> movieList;

    public MyAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals((View)o);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false);
        ImageView movie_image = (ImageView)view.findViewById(R.id.movie_image);
        TextView movie_title = (TextView)view.findViewById(R.id.movie_title);
        TextView movie_description = (TextView)view.findViewById(R.id.movie_description);
        FloatingActionButton floatingActionButton = (FloatingActionButton)view.findViewById(R.id.btn_fav);

        movie_image.setImageResource(movieList.get(position).getPage());
        movie_title.setText(movieList.get(position).getName());
        movie_description.setText(movieList.get(position).getDescription());
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Button clicked! Your favorite film", Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "" + movieList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        container.addView(view);
        return view;
    }
}
