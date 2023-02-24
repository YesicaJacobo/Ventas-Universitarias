package com.solanobejarano.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void nextActivity(View view){
        Intent next = new Intent(this, Carrito.class);
        startActivity(next);
    }

    public void nextActivity2(View view){
        Intent next = new Intent(this, Restaurante.class);
        startActivity(next);
    }

    public void nextActivity3(View view){
        Intent next = new Intent(this, OpcionesUsuario.class);
        startActivity(next);
    }

}