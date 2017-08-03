package com.example.dptoredes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.nombre_usuario);
    }

    public void abrirNumero(View view){
        Intent intent = new Intent(this, numero.class);
        String usser = usuario.getText().toString();

        intent.putExtra("usuario", usser);
        startActivity(intent);
    }




}
