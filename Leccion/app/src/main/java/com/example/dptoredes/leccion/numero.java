package com.example.dptoredes.leccion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class numero extends AppCompatActivity{

    TextView nombre;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numero);

        nombre = (EditText)findViewById(R.id.nombre);
        Intent intent=getIntent();
        String name = intent.getStringExtra("usuario");
        nombre.setText("Bienvenido: " +name);
    }

}
