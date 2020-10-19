package com.example.proyecto_views;

//Objeto tipo juego con sus respectivos parametros y metodos

public class Juegos{
    private String nombre;
    private String plataforma;
    private String descripcion;

    public Juegos(String nombre, String plataforma, String descripcion){
        this.nombre= nombre;
        this.plataforma=plataforma;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
