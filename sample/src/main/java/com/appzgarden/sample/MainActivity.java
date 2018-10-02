package com.appzgarden.sample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appzgarden.OtpView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OtpView otpView= findViewById(R.id.otpview);
        TextInputLayout textInputLayout = findViewById(R.id.textinputlayout);// use this to set error
        otpView.setTextInputLayout(textInputLayout);
        otpView.setOtpViewEventListener(new OtpView.OtpViewEventListener() {
            @Override
            public void onDataEntered(OtpView OtpView, boolean fromUser) {
                // do something here
            }
        });

    }
}
