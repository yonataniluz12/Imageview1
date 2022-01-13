package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn;
int num = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

    }

    public void go(View view){
        num ++;
        if (num ==7){
            if (num % 7 == 0){
                btn.setText("BOOM !\n");
        if(num<7){
                btn.setText("This is a click number:\n"+num);
            }
        }
    }
}