package com.example.pj1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Test1 extends AppCompatActivity {
    Button B1,B2,B3,B4,B5;
    ImageView imageView1;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        imageView1 = (ImageView) findViewById(R.id.img1);
        B1 = (Button) findViewById(R.id.b1);
        B2 = (Button) findViewById(R.id.b2);
        B3 = (Button) findViewById(R.id.b3);

        B4 = (Button) findViewById(R.id.b4);
        B5 = (Button) findViewById(R.id.b5);

        imageView1.setImageResource(R.drawable.juice);
        B2.setText("I");
        B3.setText("j");
        B4.setText("K");

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_LONG).show();
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();
                B5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Test2.class);
                        startActivity(intent);
                        finish();
                    }
                });

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_LONG).show();
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Woo!!! your score is" + "......." + 2);
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("Your score");
                alert.show();
            }
        });
    }

}
