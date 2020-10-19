package com.example.proyecto_views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView Jueguitos;
    private GridLayoutManager glm;
    private Adaptador adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos los valores
        Jueguitos= (RecyclerView)findViewById(R.id.jueguitos);
        //creamos un nuevo objeto de tipo "Administrador de diseño" que nos ayuda a organizar las CardViews generadas en columnas
        glm= new GridLayoutManager(this,2);
        Jueguitos.setLayoutManager(glm);
        //Creamos un objeto de tipo Adaptador que utiliza el metodo dataSet para agregar datos a cada una de la vistas
        adapter = new Adaptador(dataSet());
        Jueguitos.setAdapter(adapter);

    }

        //Este metodo lo utilizamos para agregar datos al ArrayList que contiene las vistas
    private ArrayList<Juegos> dataSet() {
        ArrayList<Juegos> data= new ArrayList<>();
        data.add(new Juegos("Diablo 2", "PC, Mac OS","Diablo II es un videojuego de rol de acción."));
        data.add(new Juegos("Genshin Impact", "PC, Playstation 4, Nintendo Switch, Android, IOs","Genshin Impact es un juego de acción RPG de mundo abierto con mecánica de monetización Gacha para conseguir elementos adicionales como armas y otros recursos."));
        data.add(new Juegos("Albion Online", "Windows, Linux, MAC OSX, Android.","Albion Online es un Mmorpg no lineal en el que escribes tu propia historia"));
        data.add(new Juegos("Path of exile", "PC, Playstation 4, Xbox One, Mac OS","Path of Exile es un ARPG y MMO ambientado en un mundo de fantasía oscura. Lo desarrolla la compañía independiente neozelandesa Grinding Gear Games y se puede descargar y jugar gratis."));
        data.add(new Juegos("Diablo 2", "PC","Hola buenas tardes"));
        return data;
    }
}
