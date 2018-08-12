package com.example.melg.recruit.Recruit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.melg.recruit.R;
import com.example.melg.recruit.Recruit.discover.view.DiscoverActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RecForm extends AppCompatActivity {

    @BindView(R.id.btnFind)
    Button btnFind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_rec);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Developer Request");

    }

    @OnClick(R.id.btnFind)
    public void onViewClicked() {
        Intent view = new Intent(this, DiscoverActivity.class);
        startActivity(view);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You Are About to exit the app", Toast.LENGTH_LONG).show();

    }
}
