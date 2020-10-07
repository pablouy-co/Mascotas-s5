package com.pflb.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        /*Agregado de Toolbar*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        /*Navegacion hacia atrás*/
        //En AndroidManifest hay que indicar quien es la actividad padre
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}