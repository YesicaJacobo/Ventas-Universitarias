package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tiendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);

        //Oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton atras
        ImageButton back = findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Home.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton crear tienda
        Button crear = findViewById(R.id.crear);
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CrearTienda.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 1)
        ImageButton edit1 = findViewById(R.id.edit1);
        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tienda.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 2)
        ImageButton edit2 = findViewById(R.id.edit2);
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tienda.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 3)
        ImageButton edit3 = findViewById(R.id.edit3);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tienda.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}