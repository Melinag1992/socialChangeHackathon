package com.example.melg.recruit.Recruit.discover.view;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.example.melg.recruit.R;
import com.example.melg.recruit.models.GitProjects;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;

import static java.security.AccessController.getContext;

public class TouristSpotCardAdapter extends ArrayAdapter<GitProjects> {

    @BindView(R.id.titleTv) TextView titleTv;
    @BindView(R.id.project_recoring) ImageView projectRecoring;

    public TouristSpotCardAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        ViewHolder holder;

        if (contentView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            contentView = inflater.inflate(R.layout.projects_itemview, parent, false);
            holder = new ViewHolder(contentView);
            contentView.setTag(holder);
        } else {
            holder = (ViewHolder) contentView.getTag();
        }

        GitProjects spot = getItem(position);

        holder.titleTv.setText(spot.getProjectName());

        if (position%2==0){





        }
        else{

            Glide.with(getContext())
                    .load(R.raw.gif)
                    .into(holder.projectRecoring);
        }



        return contentView;
    }



    public static class ViewHolder {

        @BindView(R.id.titleTv) TextView titleTv;
        @BindView(R.id.project_recoring)
        ImageView projectRecoring;


        public ViewHolder(View contentView) {

            ButterKnife.bind(this, contentView);
        }
    }

}
