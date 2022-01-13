package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }
    public void go(View view) {
        num ++;
        if (num > 6){
            btn.setText("This is click number: "+num);}
        else{
            num = 0;
            num ++;
            btn.setText("Enough to click. Go to new start!\n"+num);}
    }
}