package com.example.mcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Button Goback,LastNext,Yes,No;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Goback=findViewById(R.id.goback);
        progressBar=findViewById(R.id.progressBar);
        LastNext=findViewById(R.id.next);
        Yes=findViewById(R.id.yes);
        No=findViewById(R.id.no);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Response Noted: Yes", Toast.LENGTH_SHORT).show();
            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Response Noted: No", Toast.LENGTH_SHORT).show();
            }
        });
        LastNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Thanks for your feedback!", Toast.LENGTH_SHORT).show();
            }
        });
        Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


    }
}