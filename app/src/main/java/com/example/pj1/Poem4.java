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

public class Poem4 extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    Button B1,B2,B3,B4,B5,B6,B7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem4);

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.aa21);
        final MediaPlayer sound2=MediaPlayer.create(this,R.raw.aa22);
        final MediaPlayer sound3=MediaPlayer.create(this,R.raw.aa23);
        final MediaPlayer sound4=MediaPlayer.create(this,R.raw.aa24);
        final MediaPlayer sound5=MediaPlayer.create(this,R.raw.aa25);
        final MediaPlayer sound6=MediaPlayer.create(this,R.raw.aa26);


        imageView1=(ImageView)findViewById(R.id.img1);
        imageView2=(ImageView)findViewById(R.id.img2);
        imageView3=(ImageView)findViewById(R.id.img3);
        imageView4=(ImageView)findViewById(R.id.img4);
        imageView5=(ImageView)findViewById(R.id.img5);
        imageView6=(ImageView)findViewById(R.id.img6);


        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        B4=(Button)findViewById(R.id.b4);
        B5=(Button)findViewById(R.id.b5);
        B6=(Button)findViewById(R.id.b6);
        B7=(Button)findViewById(R.id.b7);


        imageView1.setImageResource(R.drawable.uncle);
        imageView2.setImageResource(R.drawable.violin);
        imageView3.setImageResource(R.drawable.well);
        imageView4.setImageResource(R.drawable.box);
        imageView5.setImageResource(R.drawable.yellow);
        imageView6.setImageResource(R.drawable.zoo);

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
                sound6.start();
            }
        });


        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
