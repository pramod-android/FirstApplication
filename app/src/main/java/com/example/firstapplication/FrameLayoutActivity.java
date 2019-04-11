package com.example.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FrameLayoutActivity extends AppCompatActivity {
    Button buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        getSupportActionBar().setTitle("Login view");
        buttonSignUp=(Button) findViewById(R.id.btnsignup);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FrameLayoutActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
                Toast.makeText(FrameLayoutActivity.this, "redirect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
