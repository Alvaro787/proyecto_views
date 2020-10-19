package com.example.proyecto_views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.JuegoViewHolder> {

    private ArrayList<Juegos> data;
    public Adaptador(ArrayList<Juegos> data) {
        this.data = data;
    }

    //Declaramos la siguiente clase para que el Adaptador pueda ingresar la informacion
    //respectiva a cada una de las CardViews

    public class JuegoViewHolder extends RecyclerView.ViewHolder {
        //Se declaran los parametros que necesitamos (declarados previamente en la clase Juegos)
        TextView nombre;
        TextView plataforma;
        TextView descrip;

        //En su constructor respectivo asignamos los valores a cada parametro
        //que en este caso son las id de los TextView mostrados en cardview1.xml
        public JuegoViewHolder(View itemView) {
            super(itemView);
            nombre= (TextView)itemView.findViewById(R.id.nombre1);
            plataforma= (TextView)itemView.findViewById((R.id.plat1));
            descrip= (TextView)itemView.findViewById((R.id.descri1));
        }
    }

    //Luego de declarar la clase anterior podemos generar los 3 siguientes metodos
    //onCreateViewHolder es para crear una vista JuegoViewHolder y la conecta a los recursos definidos en cardview1.xml
    @Override
    public JuegoViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new JuegoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview1,parent,false));
    }

    //OnVindViewHolder ingresa la información a los parametros declarados
    @Override
    public void onBindViewHolder(JuegoViewHolder holder, int position) {

        Juegos juego = data.get(position);
        holder.nombre.setText(juego.getNombre());
        holder.plataforma.setText(juego.getPlataforma());
        holder.descrip.setText(juego.getDescripcion());
    }
    //Retorna la cantidad de elementos del ArrayList
    @Override
    public int getItemCount() {
        return data.size();
    }
}

