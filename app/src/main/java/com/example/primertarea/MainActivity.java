package com.example.primertarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btn_enviar(View view) {
        //Creamos el Intent
        int genero=0;
        Intent intent = new Intent(MainActivity.this, actividad2.class);
        RadioGroup rdgpGenero =findViewById(R.id.rdbtGenero);
        RadioButton radioBtn;
        EditText txt_nombre = (EditText) findViewById(R.id.txt_nombre);
        EditText txt_telefono = (EditText) findViewById(R.id.txt_telefono);
        EditText txt_fecha = (EditText) findViewById(R.id.txt_fecha);

        genero= rdgpGenero.getCheckedRadioButtonId();
        radioBtn=findViewById(genero);


        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle nom = new Bundle();
        Bundle tel = new Bundle();
        Bundle fec = new Bundle();
        Bundle gen = new Bundle();

        nom.putString("NOMBRE", txt_nombre.getText().toString());
        tel.putString("TELEFONO", txt_telefono.getText().toString());
        fec.putString("FECHA", txt_fecha.getText().toString());
        gen.putString("GENERO", radioBtn.getText().toString());



        //Añadimos la información al intent
        intent.putExtras(nom);
        intent.putExtras(tel);
        intent.putExtras(fec);
        intent.putExtras(gen);
        // Iniciamos la nueva actividad
        startActivity(intent);
    }

}
