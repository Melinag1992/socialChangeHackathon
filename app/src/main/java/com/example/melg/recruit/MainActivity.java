package com.example.melg.recruit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.email_edit_text_register) TextView email;
    @BindView(R.id.password_edit_text_register) TextView password;
    @BindView(R.id.sign_in_button) Button signInButton;
    @BindView(R.id.register_button) Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }
}
