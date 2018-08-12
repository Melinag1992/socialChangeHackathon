package com.example.melg.recruit.Recruit.discover.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.melg.recruit.R;
import com.example.melg.recruit.Recruit.discover.view.cardstack.CardStackTransformer;
import com.example.melg.recruit.Recruit.discover.view.cardstack.ViewPagerAdapter;
import com.example.melg.recruit.models.GitProjects;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.SwipeDirection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DiscoverActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    private DatabaseReference recruiterRef = database.getReference("user");

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.dislikeBtn)
    FloatingActionButton dislikeBtn;
    @BindView(R.id.likeBtn)
    FloatingActionButton likeBtn;
    @BindView(R.id.cardStack)
    CardStackView cardStackView;

    private ViewPagerAdapter viewPagerAdapter;
    private List<GitProjects> listResults;


//    private ProgressBar progressBar;
//    private CardStackView cardStackView;
//    private TouristSpotCardAdapter adapter;


    private TouristSpotCardAdapter adapter;
    private String project_des;
    private String project_title;
    private String project_git;
    private String project_language;
    private String project_keywords;
    private String project_url;
    private String TAG = "BULLSHIT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        ButterKnife.bind(this);
        listResults = new ArrayList<>();



        recruiterRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Log.d(TAG, "onDataChange: "+  dataSnapshot.getKey());


//                for (int i = 0; i <=4 ; i++) {
//                  project_des =  dataSnapshot.child("user_00" + i).child("projects").child("project_des").getValue().toString();
//                  project_title =  dataSnapshot.child("user_00" + i).child("projects").child("project_title").getValue().toString();
//                  project_git =  dataSnapshot.child("user_00" + i).child("projects").child("project_git").getValue().toString();
////                  project_url =  dataSnapshot.child("user_00" + i).child("projects").child("project_").getValue().toString();
//                  project_keywords =  dataSnapshot.child("user_00" + i).child("projects").child("project_keywords").getValue().toString();
//                  project_language =  dataSnapshot.child("user_00" + i).child("projects").child("language").getValue().toString();
//
//                    Log.d(TAG, "onDataChange: " + project_des + " " + project_title + " " + project_git + " " + project_keywords + " " + project_keywords +" " + project_language);
//                }


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d(TAG, "onCancelled: " + databaseError.getCode());

            }
        });

//        listResults.add(new GitProjects("Bloxsee App", "loxsee..", "bloxsee",project_des,project_language,project_keywords));
//        listResults.add(new GitProjects("Tasks App", "task..", "task"));
//        listResults.add(new GitProjects("Yelp App", "yelp..", "yelp"));

//        fillListResult();


        viewPagerAdapter = new ViewPagerAdapter(DiscoverActivity.this, listResults);
//        viewPager.setPageTransformer(true, new CardStackTransformer());
//        viewPager.setOffscreenPageLimit(3);
//
//        viewPager.setAdapter(viewPagerAdapter);

        setup();
        reload();



    }
//
//    private void fillListResult() {
//
//        for (int i = 0; i < 10; i++) {
//            listResults.add(new GitProjects("Project" + i, "urlGoesHere", "gif"));
//        }
//
//    }

    @OnClick({R.id.dislikeBtn, R.id.likeBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.dislikeBtn:
                swipeLeft();
                break;
            case R.id.likeBtn:
                swipeRight();
                break;
        }
    }
    public void swipeRight() {
        List<GitProjects> spots = extractRemainingTouristSpots();
        if (spots.isEmpty()) {
            return;
        }

        View target = cardStackView.getTopView();
        View targetOverlay = cardStackView.getTopView().getOverlayContainer();

        ValueAnimator rotation = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("rotation", 10f));
        rotation.setDuration(200);
        ValueAnimator translateX = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("translationX", 0f, 2000f));
        ValueAnimator translateY = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("translationY", 0f, 500f));
        translateX.setStartDelay(100);
        translateY.setStartDelay(100);
        translateX.setDuration(500);
        translateY.setDuration(500);
        AnimatorSet cardAnimationSet = new AnimatorSet();
        cardAnimationSet.playTogether(rotation, translateX, translateY);

        ObjectAnimator overlayAnimator = ObjectAnimator.ofFloat(targetOverlay, "alpha", 0f, 1f);
        overlayAnimator.setDuration(200);
        AnimatorSet overlayAnimationSet = new AnimatorSet();
        overlayAnimationSet.playTogether(overlayAnimator);

        cardStackView.swipe(SwipeDirection.Right, cardAnimationSet, overlayAnimationSet);
    }

    public void swipeLeft() {
        List<GitProjects> spots = extractRemainingTouristSpots();
        if (spots.isEmpty()) {
            return;
        }

        View target = cardStackView.getTopView();
        View targetOverlay = cardStackView.getTopView().getOverlayContainer();

        ValueAnimator rotation = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("rotation", -10f));
        rotation.setDuration(200);
        ValueAnimator translateX = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("translationX", 0f, -2000f));
        ValueAnimator translateY = ObjectAnimator.ofPropertyValuesHolder(
                target, PropertyValuesHolder.ofFloat("translationY", 0f, 500f));
        translateX.setStartDelay(100);
        translateY.setStartDelay(100);
        translateX.setDuration(500);
        translateY.setDuration(500);
        AnimatorSet cardAnimationSet = new AnimatorSet();
        cardAnimationSet.playTogether(rotation, translateX, translateY);

        ObjectAnimator overlayAnimator = ObjectAnimator.ofFloat(targetOverlay, "alpha", 0f, 1f);
        overlayAnimator.setDuration(200);
        AnimatorSet overlayAnimationSet = new AnimatorSet();
        overlayAnimationSet.playTogether(overlayAnimator);

        cardStackView.swipe(SwipeDirection.Left, cardAnimationSet, overlayAnimationSet);
    }

    private LinkedList<GitProjects> extractRemainingTouristSpots() {
        LinkedList<GitProjects> spots = new LinkedList<>();
        for (int i = cardStackView.getTopIndex(); i < adapter.getCount(); i++) {
            spots.add(adapter.getItem(i));
        }
        return spots;
    }


//    private TouristSpotCardAdapter createGitProjectsCardAdapter() {
//        final TouristSpotCardAdapter adapter = new TouristSpotCardAdapter(getApplicationContext());
//        adapter.addAll(listResults);
//        return adapter;
//    }

    private void setup() {


        cardStackView.setCardEventListener(new CardStackView.CardEventListener() {
            @Override
            public void onCardDragging(float percentX, float percentY) {
                //Log.d("CardStackView", "onCardDragging");
            }

            @Override
            public void onCardSwiped(SwipeDirection direction) {
                Log.d("CardStackView", "onCardSwiped: " + direction.toString());
                Log.d("CardStackView", "topIndex: " + cardStackView.getTopIndex());
            }

            @Override
            public void onCardReversed() {
                Log.d("CardStackView", "onCardReversed");
            }

            @Override
            public void onCardMovedToOrigin() {
                Log.d("CardStackView", "onCardMovedToOrigin");
            }

            @Override
            public void onCardClicked(int index) {
                Log.d("CardStackView", "onCardClicked: " + index);
            }
        });
    }

    private TouristSpotCardAdapter createTouristSpotCardAdapter() {
        final TouristSpotCardAdapter adapter = new TouristSpotCardAdapter(getApplicationContext());
        adapter.addAll(listResults);
        return adapter;
    }

    private void reload() {
        adapter = createTouristSpotCardAdapter();
        cardStackView.setAdapter(adapter);
        cardStackView.setVisibility(View.VISIBLE);
    }
}
