package com.example.homework81;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button btn;
    Switch switc;
    ToggleButton toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.linearlayout);
        btn = findViewById(R.id.button);
        switc = findViewById(R.id.switch1);
        toggle = findViewById(R.id.toggleButton);
    }

    public void button1(View view) {
        if(switc.isChecked()&&toggle.isChecked()){
            layout.setBackgroundColor(Color.RED);
        }
        else if(switc.isChecked()&&!toggle.isChecked()){
            layout.setBackgroundColor(Color.GREEN);
        }
        else if(!switc.isChecked()&&toggle.isChecked()){
            layout.setBackgroundColor(Color.BLUE);
        }
        else if(!switc.isChecked()&&!toggle.isChecked()){
            layout.setBackgroundColor(Color.YELLOW);
        }
    }
}