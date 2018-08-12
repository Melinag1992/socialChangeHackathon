package com.example.melg.recruit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.melg.recruit.Recruit.discover.view.DiscoverActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.email_edit_text_register)
    TextView email;
    @BindView(R.id.password_edit_text_register)
    TextView password;
    @BindView(R.id.sign_in_button)
    Button signInButton;
    @BindView(R.id.register_button)
    Button registerButton;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onViewClicked() {

        Intent view = new Intent(this, DiscoverActivity.class);
        startActivity(view);
    }
}
