package com.example.pj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button B1,B2,B3;
    Button B11;
    ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=(ImageView)findViewById(R.id.img1);
        imageView2=(ImageView)findViewById(R.id.img2);
        imageView3=(ImageView)findViewById(R.id.img3);
        imageView4=(ImageView)findViewById(R.id.img4);
        textView=(TextView)findViewById(R.id.txt1);
        B1=(Button)findViewById(R.id.b1);
        B2=(Button)findViewById(R.id.b2);
        B3=(Button)findViewById(R.id.b3);
        imageView1.setImageResource(R.drawable.education);
        imageView2.setImageResource(R.drawable.learn);
        imageView3.setImageResource(R.drawable.poem);
        imageView4.setImageResource(R.drawable.test);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Learn.class);
                startActivity(intent);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Poem.class);
                startActivity(intent);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Test.class);
                startActivity(intent);
            }
        });


    }
}
