package com.example.primertarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        //Localizar los controles
        TextView lbl_sal_nombre = (TextView)findViewById(R.id.lbl_sal_nombre);
        TextView lbl_sal_telefono = (TextView)findViewById(R.id.lbl_sal_telefono);
        TextView lbl_sal_fecha = (TextView)findViewById(R.id.lbl_sal_fecha);
        TextView lbl_sal_genero = (TextView)findViewById(R.id.lbl_sal_genero);

        //Recuperamos la información pasada en el intent
        Bundle bundle_nom = this.getIntent().getExtras();
        Bundle bundle_tel = this.getIntent().getExtras();
        Bundle bundle_fec = this.getIntent().getExtras();
        Bundle bundle_gen = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        lbl_sal_nombre.setText(bundle_nom.getString("NOMBRE"));
        lbl_sal_telefono.setText(bundle_tel.getString("TELEFONO"));
        lbl_sal_fecha.setText(bundle_fec.getString("FECHA"));
        lbl_sal_genero.setText(bundle_gen.getString("GENERO"));
    }

}
