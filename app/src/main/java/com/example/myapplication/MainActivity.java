package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private ImageButton imageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        imageBtn = (ImageButton) findViewById(R.id.imageBtn);
        imageBtn.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.button:
                btn.setText("Popov");
                Toast.makeText(MainActivity.this, "My last name", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "I changed my name", Toast.LENGTH_LONG).show();
                break;
            case R.id.imageBtn:
                btn.setText("Danil");
                Toast.makeText(MainActivity.this, "My first name", Toast.LENGTH_SHORT).show();
                imageBtn.setBackgroundColor(Color.parseColor("#4CB8FB"));
                break;
        }


    }


}