package com.pflb.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMascota;
    private RecyclerViewAdaptador adaptadorMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        recyclerViewMascota = (RecyclerView) findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMascota = new RecyclerViewAdaptador(obtenerMascota());
        recyclerViewMascota.setAdapter(adaptadorMascota);
    }

    /*Listado del RecyclerView del MainActivity*/
    public List<MascotaModelo> obtenerMascota(){
        List<MascotaModelo> mascota = new ArrayList<>();
        mascota.add(new MascotaModelo("Roco",R.drawable.perro1));
        mascota.add(new MascotaModelo("Pepe",R.drawable.perro2));
        mascota.add(new MascotaModelo("Newton",R.drawable.perro3));

        return mascota;
    }

    /*Agregar acciones al action bar*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*Ir al segundo activity al tocar la estrella o el menu*/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_favorite){
            Intent siguiente = new Intent(this, MejoresMascotas.class);
            startActivity(siguiente);
        } else if (item.getItemId() == R.id.menuContacto){
            Intent contacto = new Intent(this, Contacto.class);
            startActivity(contacto);
        } else if (item.getItemId() == R.id.menuAcercaDe) {
            Intent acerca = new Intent(this, AcercaDe.class);
            startActivity(acerca);
        }


        //Otra forma de hacerlo es con switch
        /*switch (item.getItemId()){
            case R.id.action_favorite:
                Intent siguiente = new Intent(this, MejoresMascotas.class);
                startActivity(siguiente);
            case R.id.menuContacto:
                Intent contacto = new Intent(this, Contacto.class);
                startActivity(contacto);
            case R.id.acerca:
                Intent acerca = new Intent(this, AcercaDe.class);
                startActivity(acerca);
            default:
                return super.onOptionsItemSelected(item);
        }*/
        return super.onOptionsItemSelected(item);
    }
}