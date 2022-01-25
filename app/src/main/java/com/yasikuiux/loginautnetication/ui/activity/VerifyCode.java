package com.yasikuiux.loginautnetication.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.yasikuiux.loginautnetication.R;

public class VerifyCode extends AppCompatActivity{



    //BACKPRESS
    ImageView backarrow;

    //VerifyButton
    RelativeLayout verify_btn;


    //OTP CLICK
    private EditText editText_one,editText_two,editText_three,editText_four;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        //STATUS BAR COLOR
        Window window = this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));


        //BACKPRESS

        backarrow=(ImageView)findViewById(R.id.backarrow);
        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),PhoneAuth.class);
                startActivity(intent);

            }
        });

        //VerifyButton
        verify_btn=(RelativeLayout) findViewById(R.id.verify_btn);
        verify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Verified Successfully",Toast.LENGTH_SHORT).show();

            }
        });
    }



}