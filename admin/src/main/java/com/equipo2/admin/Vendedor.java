package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Vendedor extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor);
        context = getApplicationContext();

        //Oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton atras
        ImageButton back = findViewById(R.id.back6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Vendedores.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton actualizar
        Button actualizar = (Button) findViewById(R.id.actualizar2);
        actualizar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Vendedor actualizado");
            }
        });

        //Accion del boton eliminar
        Button eliminar = (Button) findViewById(R.id.eliminar2);
        eliminar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Vendedor eliminado");
            }
        });

    }

    //Metodo del Toast
    protected void showShortToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}