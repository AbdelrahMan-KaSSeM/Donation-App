package com.example.android.projectgdedwhothomfeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Charites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charites);

    }

    public void ss (View view){
        Intent ss = new Intent(Charites.this,ResalaInfo.class);
        startActivity(ss);
    }
}
