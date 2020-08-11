package com.example.pj1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;

public class Learn extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,
    imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,
    imageView17,imageView18,imageView19,imageView20,imageView21,imageView22,imageView23,imageView24,
    imageView25,imageView26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
      imageView1=(ImageView)findViewById(R.id.img1);
      imageView2=(ImageView)findViewById(R.id.img2);
      imageView3=(ImageView)findViewById(R.id.img3);
      imageView4=(ImageView)findViewById(R.id.img4);
      imageView5=(ImageView)findViewById(R.id.img5);
      imageView6=(ImageView)findViewById(R.id.img6);
      imageView7=(ImageView)findViewById(R.id.img7);
      imageView8=(ImageView)findViewById(R.id.img8);
      imageView9=(ImageView)findViewById(R.id.img9);
      imageView10=(ImageView)findViewById(R.id.img10);
      imageView11=(ImageView)findViewById(R.id.img11);
      imageView12=(ImageView)findViewById(R.id.img12);
      imageView13=(ImageView)findViewById(R.id.img13);
      imageView14=(ImageView)findViewById(R.id.img14);
      imageView15=(ImageView)findViewById(R.id.img15);
      imageView16=(ImageView)findViewById(R.id.img16);
      imageView17=(ImageView)findViewById(R.id.img17);
      imageView18=(ImageView)findViewById(R.id.img18);
      imageView19=(ImageView)findViewById(R.id.img19);
      imageView20=(ImageView)findViewById(R.id.img20);
      imageView21=(ImageView)findViewById(R.id.img21);
      imageView22=(ImageView)findViewById(R.id.img22);
      imageView23=(ImageView)findViewById(R.id.img23);
      imageView24=(ImageView)findViewById(R.id.img24);
      imageView25=(ImageView)findViewById(R.id.img25);
      imageView26=(ImageView)findViewById(R.id.img26);

        imageView1.setImageResource(R.drawable.a1);
        imageView2.setImageResource(R.drawable.b1);
        imageView3.setImageResource(R.drawable.c1);
        imageView4.setImageResource(R.drawable.d1);
        imageView5.setImageResource(R.drawable.e1);
        imageView6.setImageResource(R.drawable.f1);
        imageView7.setImageResource(R.drawable.g1);
        imageView8.setImageResource(R.drawable.h1);
        imageView9.setImageResource(R.drawable.i1);
        imageView10.setImageResource(R.drawable.j1);
        imageView11.setImageResource(R.drawable.k1);
        imageView12.setImageResource(R.drawable.l1);
        imageView13.setImageResource(R.drawable.m1);
        imageView14.setImageResource(R.drawable.n1);
        imageView15.setImageResource(R.drawable.o1);
        imageView16.setImageResource(R.drawable.p1);
        imageView17.setImageResource(R.drawable.q1);
        imageView18.setImageResource(R.drawable.r1);
        imageView19.setImageResource(R.drawable.s1);
        imageView20.setImageResource(R.drawable.t1);
        imageView21.setImageResource(R.drawable.u1);
        imageView22.setImageResource(R.drawable.v1);
        imageView23.setImageResource(R.drawable.w1);
        imageView24.setImageResource(R.drawable.xxx1);
        imageView25.setImageResource(R.drawable.yyy1);
        imageView26.setImageResource(R.drawable.zzz1);





      imageView1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(getApplicationContext(), A.class);
              startActivity(intent);
          }
      });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),B.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),C.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),D.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),E.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),F.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),G.class);
                startActivity(intent);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),H.class);
                startActivity(intent);
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),I.class);
                startActivity(intent);
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),J.class);
                startActivity(intent);
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),K.class);
                startActivity(intent);
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),L.class);
                startActivity(intent);
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),M.class);
                startActivity(intent);
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),N.class);
                startActivity(intent);
            }
        });

        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),O.class);
                startActivity(intent);
            }
        });

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),P.class);
                startActivity(intent);
            }
        });

        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Q.class);
                startActivity(intent);
            }
        });

        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RR.class);
                startActivity(intent);
            }
        });

        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),S.class);
                startActivity(intent);
            }
        });

        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),T.class);
                startActivity(intent);
            }
        });

        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),U.class);
                startActivity(intent);
            }
        });

        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),V.class);
                startActivity(intent);
            }
        });

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),W.class);
                startActivity(intent);
            }
        });

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),X.class);
                startActivity(intent);
            }
        });
        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Y.class);
                startActivity(intent);
            }
        });

        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Z.class);
                startActivity(intent);
            }
        });


    }

}
