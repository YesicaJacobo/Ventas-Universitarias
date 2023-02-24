package com.equipo2.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Tienda extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
        context = getApplicationContext();

        //Oculta la ActionBar
        getSupportActionBar().hide();

        //Accion del boton atras
        ImageButton back = findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Tiendas.class);
                startActivityForResult(intent, 0);
            }
        });

        //Accion del boton deshabilitar
        Button deshabilitar = (Button) findViewById(R.id.deshabilitar);
        deshabilitar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Tienda deshabilitada");
            }
        });

        //Accion del boton actualizar
        Button actualizar = (Button) findViewById(R.id.actualizar);
        actualizar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Tienda actualizada");
            }
        });

        //Accion del boton eliminar
        Button eliminar = (Button) findViewById(R.id.eliminar);
        eliminar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                showShortToast("Tienda eliminada");
            }
        });

    }

    //Metodo del Toast
    protected void showShortToast(String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}