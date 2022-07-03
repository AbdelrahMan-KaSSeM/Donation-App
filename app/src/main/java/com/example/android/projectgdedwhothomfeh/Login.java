package com.example.android.projectgdedwhothomfeh;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String passwrod = e2.getText().toString();
                Boolean chkmailpass = db.emailpassword(email, passwrod);
                if (chkmailpass == true)
                    Toast.makeText(getApplicationContext(), "wrong email or pass", Toast.LENGTH_SHORT).show();
                else {
                    Intent mm=new Intent(Login.this,Charites.class);
                    startActivity(mm);
                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
