package com.yasikuiux.loginautnetication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.yasikuiux.loginautnetication.R;

public class PhoneAuth extends AppCompatActivity {

    //BACKPRESS
    ImageView backarrow;

    //NextButton
    RelativeLayout next_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_auth);

        //STATUS BAR COLOR
        Window window = this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        //BACKPRESS

        backarrow = (ImageView) findViewById(R.id.backarrow);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        //NextButton
        next_btn = (RelativeLayout) findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), VerifyCode.class);
                startActivity(intent);

            }
        });

    }

}