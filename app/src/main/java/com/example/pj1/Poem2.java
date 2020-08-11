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

public class Poem2 extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5;
    Button B1,B2,B3,B4,B5,B6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem2);

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.aa11);
        final MediaPlayer sound2=MediaPlayer.create(this,R.raw.aa12);
        final MediaPlayer sound3=MediaPlayer.create(this,R.raw.aa13);
        final MediaPlayer sound4=MediaPlayer.create(this,R.raw.aa14);
        final MediaPlayer sound5=MediaPlayer.create(this,R.raw.aa15);

        imageView1=(ImageView)findViewById(R.id.img1);
        imageView2=(ImageView)findViewById(R.id.img2);
        imageView3=(ImageView)findViewById(R.id.img3);
        imageView4=(ImageView)findViewById(R.id.img4);
        imageView5=(ImageView)findViewById(R.id.img5);

        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        B4=(Button)findViewById(R.id.b4);
        B5=(Button)findViewById(R.id.b5);
        B6=(Button)findViewById(R.id.b6);

        imageView1.setImageResource(R.drawable.king);
        imageView2.setImageResource(R.drawable.leaf);
        imageView3.setImageResource(R.drawable.man);
        imageView4.setImageResource(R.drawable.neck);
        imageView5.setImageResource(R.drawable.ocean);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound1.start();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound2.start();
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound3.start();
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound4.start();
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound5.start();
            }
        });


        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Poem3.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
