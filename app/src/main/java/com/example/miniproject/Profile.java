package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity implements View.OnClickListener{
Button b,w;
TextView n,p,ac,bc;
EditText a;
ImageView deposit,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toast.makeText(Profile.this,"Login Successfull",Toast.LENGTH_SHORT).show();

        n=(TextView)findViewById(R.id.nameColumn);
        p=(TextView)findViewById(R.id.pinColumn);
        ac=(TextView)findViewById(R.id.accColumn);
        bc=(TextView)findViewById(R.id.balanceColumn);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String s1=bundle.getString("name");
            String s2=bundle.getString("pin");
            String s3=bundle.getString("acc");
            n.setText(s1);
            p.setText(s2);
            ac.setText(s3);
            bc.setText("10000");
        }


        b=(Button)findViewById(R.id.depositButton);
         w=(Button)findViewById(R.id.withDrawButton);
         a=(EditText) findViewById(R.id.Amount);
        b.setOnClickListener(this);
        w.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(R.id.depositButton==v.getId()) {
            Intent intent = new Intent(Profile.this, finalActivity.class);
            String ba = a.getText().toString();

            intent.putExtra("depositBalance", ba);
            startActivity(intent);

        }
        else if(R.id.withDrawButton==v.getId())
        {
            Intent intent = new Intent(Profile.this, ChangeActivity.class);
            String ba = a.getText().toString();

            intent.putExtra("WithdrawBalance", ba);
            startActivity(intent);

        }
    }
}
