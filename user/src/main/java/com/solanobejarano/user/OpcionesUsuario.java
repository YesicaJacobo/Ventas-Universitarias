package com.solanobejarano.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OpcionesUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_usuario);
        findViewById(R.id.btnClientInfoEdit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditClientInfo();
            }
        });
    }

    public void nextActivity(View view){
        Intent next = new Intent(this, Pedidos.class);
        startActivity(next);
    }

    public void nextActivity2(View view){
        Intent next = new Intent(this, HistorialPedidos.class);
        startActivity(next);
    }

    public void nextActivity3(View view){
        Intent next = new Intent(this, Login.class);
        startActivity(next);
    }

    public void nextActivity4(View view){
        Intent next = new Intent(this, info.class);
        startActivity(next);
    }

    public void nextActivity5(View view){
        Intent next = new Intent(this, Home.class);
        startActivity(next);
    }

    protected void openEditClientInfo() {
        Intent clientInfoWindow = new Intent(this, ClientInfoActivity.class);
        startActivity(clientInfoWindow);
    }


}