package com.example.android.projectgdedwhothomfeh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class ResalaInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resala_info);
    }

    public void open(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:19450"));
        startActivity(intent);
    }

    public void openw(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://resala.org"));
        startActivity(intent);
    }

    public void openm(View view) {
    /*    String uri = String.format(Locale.ENGLISH, "geo:%f,%f",29.974523, 31.282277);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
*/
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://maps.google.com/maps?daddr=29.974523,31.282277"));
        startActivity(intent);
    }


    public void visa(View view) {
        Intent something = new Intent(ResalaInfo.this,payvisa.class);
        startActivity(something);
    }

    public void clothes(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        startActivity(emailIntent);
    }
}
