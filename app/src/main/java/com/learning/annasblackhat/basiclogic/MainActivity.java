package com.learning.annasblackhat.basiclogic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1, txt2;
    private Button btnA1, btnA2, btnA3;
    private Button btnB1, btnB2, btnB3;
    private int grupA=0, grupB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView)findViewById(R.id.txt1);
        txt2 = (TextView)findViewById(R.id.txt2);
        btnA1 = (Button)findViewById(R.id.btnA1);
        btnA2 = (Button)findViewById(R.id.btnA2);
        btnA3 = (Button)findViewById(R.id.btnA3);
        btnB1 = (Button)findViewById(R.id.btnB1);
        btnB2 = (Button)findViewById(R.id.btnB2);
        btnB3 = (Button)findViewById(R.id.btnB3);

        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupA+=1;
                txt1.setText(String.valueOf(grupA));
            }
        });
        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupA+=2;
                txt1.setText(String.valueOf(grupA));
            }
        });
        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupA+=3;
                txt1.setText(String.valueOf(grupA));
            }
        });
        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupB+=1;
                txt2.setText(String.valueOf(grupB));
            }
        });
        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupB+=2;
                txt2.setText(String.valueOf(grupB));
            }
        });
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grupB+=3;
                txt2.setText(String.valueOf(grupB));
            }
        });

    }

    public void btnReset_Click(View v){
        grupA=0;
        grupB=0;
        txt1.setText(String.valueOf(grupA));
        txt2.setText(String.valueOf(grupB));
    }

}
