package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signUp extends AppCompatActivity implements View.OnClickListener {
Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        r=(Button)findViewById(R.id.register);
        r.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(signUp.this,MainActivity.class);
        startActivity(intent);

    }
}
