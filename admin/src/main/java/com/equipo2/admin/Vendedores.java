package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Vendedores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedores);

        //Oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton atras
        ImageButton back = findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Home.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton crear tienda
        Button crear = findViewById(R.id.crearusuario);
        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CrearVendedor.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 1)
        ImageButton edit1 = findViewById(R.id.edit1);
        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedor.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 2)
        ImageButton edit2 = findViewById(R.id.edit2);
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedor.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton editar (lapiz tienda 3)
        ImageButton edit3 = findViewById(R.id.edit3);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedor.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}