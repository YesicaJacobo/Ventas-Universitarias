package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CrearVendedor extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_vendedor);
        context = getApplicationContext();

        //Oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton atras
        ImageButton back = findViewById(R.id.back7);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedores.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton crear vendedor
        Button creartienda = (Button) findViewById(R.id.crearvendedor);
        creartienda.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Vendedor creado");
            }
        });
    }

    //Metodo del Toast
    protected void showShortToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}