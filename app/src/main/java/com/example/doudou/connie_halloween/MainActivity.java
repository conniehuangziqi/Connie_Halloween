package com.example.doudou.connie_halloween;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView trick;
    private ImageView ghost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void myClick(View view) {


        trick=findViewById(R.id.text1);

        trick.setText("Trick or Treat");


        trick=findViewById(R.id.text2);

        trick.setText("Trick or Treat");


        trick=findViewById(R.id.text3);

        trick.setText("Trick or Treat");




        trick=findViewById(R.id.subtext1);

        trick.setText("Trick or Treat");


        trick=findViewById(R.id.subtext2);

        trick.setText("Trick or Treat");


        trick=findViewById(R.id.subtext3);

        trick.setText("Trick or Treat");





        ghost=(ImageView)findViewById(R.id.cat1);

        ghost.setImageResource(R.drawable.pumpkin);


        ghost=(ImageView)findViewById(R.id.cat2);

        ghost.setImageResource(R.drawable.pumpkin);


        ghost=(ImageView)findViewById(R.id.cat3);

        ghost.setImageResource(R.drawable.pumpkin);

    }
}



