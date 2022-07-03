package com.example.android.projectgdedwhothomfeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class payvisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payvisa);
        CardForm something = (CardForm)findViewById(R.id.cardform);
        Button somethin = (Button)findViewById(R.id.btn_pay);
        final TextView payamount=(TextView)findViewById(R.id.payment_amount);
        final EditText some = (EditText) findViewById(R.id.amm);
        payamount.setText("");
        somethin.setText("pay"+some.getText().toString());
        something.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {

                Toast.makeText(payvisa.this, "Your Payment Amount = "+some.getText().toString()+"L.E \ndone , thanks", Toast.LENGTH_SHORT).show();
                Intent m=new Intent(payvisa.this,Charites.class);
                startActivity(m);
            }
        });

    }
}
