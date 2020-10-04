package com.pflb.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MejoresMascotas extends AppCompatActivity {
    private RecyclerView recyclerViewMascota;
    private RecyclerViewAdaptador adaptadorMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Agregado de Toolbar*/
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        /*Navegacion hacia atrás*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*Recycler views*/
        recyclerViewMascota = (RecyclerView) findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMascota = new RecyclerViewAdaptador(obtenerMascota());
        recyclerViewMascota.setAdapter(adaptadorMascota);
    }


    public List<MascotaModelo> obtenerMascota() {
        List<MascotaModelo> mascota = new ArrayList<>();
        mascota.add(new MascotaModelo("Tom", R.drawable.gato1));
        mascota.add(new MascotaModelo("Newton", R.drawable.perro3));
        mascota.add(new MascotaModelo("Jordan", R.drawable.gato2));
        mascota.add(new MascotaModelo("Pepe", R.drawable.perro2));
        mascota.add(new MascotaModelo("Toto", R.drawable.perro1));

        return mascota;
    }

}