package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   Button s,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"BANK Account Created SuccesFULLY",Toast.LENGTH_SHORT).show();
        s=(Button)findViewById(R.id.signup);
        l=(Button)findViewById(R.id.login);
        s.setOnClickListener(this);
        l.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(R.id.signup==v.getId())
        {
            Intent intent =new Intent(MainActivity.this,signUp.class);
            startActivity(intent);
        }
        else if(R.id.login==v.getId())
        {

            Intent intent =new Intent(MainActivity.this,Login.class);
            startActivity(intent);
        }

    }
}
