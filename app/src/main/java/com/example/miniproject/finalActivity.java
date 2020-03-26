package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class finalActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2,r;
    Button l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Toast.makeText(finalActivity.this,"Money Deposited Succesfully",Toast.LENGTH_SHORT).show();

        l=(Button)findViewById(R.id.logoutButton);
        n1=(EditText)findViewById(R.id.currentBalance);
        n2=(EditText)findViewById(R.id.AmountText);
        r=(EditText)findViewById(R.id.newBalance);
        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
           Double d1,d2,d3;
            String s=bundle.getString("depositBalance");
            String s1=bundle.getString("withdrawBalance");
            d1=Double.parseDouble(s.toString());



                n2.setText(String.valueOf(d1));



                n1.setText("10000");
                Double c = 10000 + d1;
                r.setText(String.valueOf(c));






        }
        l.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(finalActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
