package com.example.anurag.spider0;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int a=0,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=new Random().nextInt(101)+1;
        TextView random=findViewById(R.id.random);
        random.setText("Random Number=" + Integer.toString(r));


    }


public int onerupee(View view){

        a+=1;
        display();
         return 0;
       }

    public int tworupee(View view){

        a+=2;

        display();
        return 0;
    }

    public int fiverupee(View view){

        a+=5;

        display();
        return 0;
    }

    public int tenrupee(View view){

        a+=10;

        display();
        return 0;
    }


    public void display(){
          if(a>r){
              TextView Payment = (TextView) findViewById(R.id.payment);
              Payment.setText("TRY AGAIN");
              a=0;


          }

        else if(a==r){
            TextView Payment = (TextView) findViewById(R.id.payment);
            Payment.setText("Congrats,You have paid successfully");
                     LinearLayout button = findViewById(R.id.button);
                       button.setVisibility(View.GONE);
                      View random=findViewById(R.id.random);
                     random.setVisibility(View.GONE);
                     View id1=findViewById(R.id.id1);
                     id1.setVisibility(View.GONE);
                      a=0;
              RelativeLayout base= findViewById(R.id.base);
              base.setBackgroundColor(Color.parseColor("#eedd82"));



        }

        else{
            TextView Payment = (TextView) findViewById(R.id.payment);
            Payment.setText("Total Paid=" + Integer.toString(a));
        }
     }

}
