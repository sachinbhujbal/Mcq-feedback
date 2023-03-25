package com.example.mcq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Button Goback,LastNext;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Goback=findViewById(R.id.goback);
        progressBar=findViewById(R.id.progressBar);
        LastNext=findViewById(R.id.next);
//        progressBar.setProgress(90);
//        progressBar.setMax(90);

//        Next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
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