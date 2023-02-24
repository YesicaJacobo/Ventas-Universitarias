package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        context = getApplicationContext();

        //oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton tiendas
        Button tiendas = findViewById(R.id.tiendas);
        tiendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tiendas.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton usuarios
        Button usuarios = findViewById(R.id.usuarios);
        usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedores.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton cerrar sesión
        Button cerrar = findViewById(R.id.cerrar);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Login.class);
                startActivityForResult(intent, 0);

                showShortToast("Sesión cerrada");
            }
        });
    }

    //Metodo del Toast
    protected void showShortToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}