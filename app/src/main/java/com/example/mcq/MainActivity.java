package com.example.mcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Next,Goback,Rarely,Sometimes,Often,Daily;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Next=findViewById(R.id.next);
        Goback=findViewById(R.id.goback);
        progressBar=findViewById(R.id.progressBar);

        Rarely=findViewById(R.id.rarely);
        Sometimes=findViewById(R.id.sometimes);
        Often=findViewById(R.id.often);
        Daily=findViewById(R.id.daily);

        Rarely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Response Noted: Rarely ", Toast.LENGTH_SHORT).show();
            }
        });
        Sometimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Response Noted: Sometimes", Toast.LENGTH_SHORT).show();
            }
        });

        Often.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Response Noted: Often", Toast.LENGTH_SHORT).show();
            }
        });

        Daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Response Noted: Daily", Toast.LENGTH_SHORT).show();
            }
        });
            Next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            });

        Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are on first Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}