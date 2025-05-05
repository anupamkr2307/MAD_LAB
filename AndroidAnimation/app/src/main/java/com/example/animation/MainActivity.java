package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtan;
    Button bt1,bt2,bt3,bt4;
    Animation scale,rot,trans,alp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtan=findViewById(R.id.txti);
        bt1=findViewById(R.id.btn1);
        bt2=findViewById(R.id.btn2);
        bt3=findViewById(R.id.btn3);
        bt4=findViewById(R.id.btn4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scale= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.snale);
                txtan.startAnimation(scale);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                rot= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txtan.startAnimation(rot);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trans= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                txtan.startAnimation(trans);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alp= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txtan.startAnimation(alp);
            }
        });
    }
}