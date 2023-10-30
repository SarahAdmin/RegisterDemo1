package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class RegisterAUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_auser);
    }
    public void RegisterCompleted(View view) {
        Intent logUser1 = new Intent(this, MainActivity.class);
        startActivity(logUser1);
        Toast.makeText(getApplicationContext(),"Signed Up Successfully", Toast.LENGTH_LONG).show();
    }
}