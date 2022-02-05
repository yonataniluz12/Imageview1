package com.example.emagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv ;
    ImageButton ib ;
    int num ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        ib = findViewById(R.id.ib);
    }

    public void go(View view) {
        ib.setImageResource(R.drawable.click);
        num = (int) (101 * Math.random())%3 + 1 ;
        if (num == 1){
            iv.setImageResource(R.drawable.ferrari);
            ib.setImageResource(R.drawable.one);
        }
        else if (num == 12){
            iv.setImageResource(R.drawable.lamborghini);
            ib.setImageResource(R.drawable.two);
        }
        else {
            iv.setImageResource(R.drawable.bugatti);
            ib.setImageResource(R.drawable.three);
        }
    }
}