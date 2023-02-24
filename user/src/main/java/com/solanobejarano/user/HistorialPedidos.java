package com.solanobejarano.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistorialPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_pedidos);
    }
    public void nextActivity(View view){
        Intent next = new Intent(this, Ticket.class);
        startActivity(next);
    }

    public void nextActivity2(View view){
        Intent next = new Intent(this, OpcionesUsuario.class);
        startActivity(next);
    }
}