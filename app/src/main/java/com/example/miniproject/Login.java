package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button log;
    EditText name,pin,acc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.LoginName);
        pin=(EditText)findViewById(R.id.LoginPin);
        acc=(EditText)findViewById(R.id.EditAccount);



        log=(Button)findViewById(R.id.loginButton);
        log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
           String s=name.getText().toString();
           String s1=pin.getText().toString();
           String s2=acc.getText().toString();

          Intent intent =new Intent(Login.this,Profile.class);
          intent.putExtra("name",s);
          intent.putExtra("pin",s1);
          intent.putExtra("acc",s2);
          startActivity(intent);

    }
}
