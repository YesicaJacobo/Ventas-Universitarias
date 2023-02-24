package com.solanobejarano.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void nextActivity(View view){
        Intent next = new Intent(this, Home.class);
        startActivity(next);
    }

    public void nextActivity2(View view){
        Intent next2 = new Intent(this, SingUp.class);
        startActivity(next2);
    }

}