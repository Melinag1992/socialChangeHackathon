package com.example.melg.recruit.Recruit.discover.view.cardstack;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.melg.recruit.R;
import com.example.melg.recruit.models.GitProjects;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ViewPagerAdapter extends PagerAdapter {


    @BindView(R.id.titleTv) TextView titleTv;
    @BindView(R.id.project_recoring) ImageView projectRecoring;



    private List<GitProjects> contents;
    private Context context;

    public ViewPagerAdapter(Context context, List<GitProjects> listResults) {
        this.context = context;
        contents = listResults;
    }

    public void addData(List<GitProjects> data) {

        contents.addAll(data);
        notifyDataSetChanged();
    }

    public void deleteItem(int currentItem) {
        contents.remove(currentItem);
        notifyDataSetChanged();



    }

    @Override
    public int getCount() {
        return contents.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.projects_itemview, container, false);
        container.addView(view);
        ButterKnife.bind(this, view);


        titleTv.setText(contents.get(position).getProject_title());
        projectRecoring.setImageResource(R.drawable.ic_launcher_background);


        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {




        return super.getItemPosition(object);

    }


}
