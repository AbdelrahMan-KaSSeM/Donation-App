package com.example.android.projectgdedwhothomfeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1,e2,e3;
        final Button b1,b2;
        final DatabaseHelper db;
        db = new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.pass);
        e3=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.register);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(s2.equals(s3)){
                        Boolean Chkemail = db.chkemail(s1);
                        if (Chkemail==true) {
                            Boolean insert = db.insert(s1,s2);
                            if (insert==true) {
                                Toast.makeText(getApplicationContext(),"Register successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Email already exists ", Toast.LENGTH_SHORT).show();

                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "pass dont match", Toast.LENGTH_SHORT).show();

                    }}
            }

        });

    }
}
