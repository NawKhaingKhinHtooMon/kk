package com.example.pj1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class M extends AppCompatActivity {
    ImageView imageView1;
    Button B1,B2,B3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.m);

        imageView1=(ImageView)findViewById(R.id.img1);
        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);

        imageView1.setImageResource(R.drawable.m1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound1.start();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),L.class);
                startActivity(intent);
                finish();
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),N.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
