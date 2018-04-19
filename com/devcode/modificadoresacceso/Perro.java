package com.devcode.modificadoresacceso;

public class Perro
{
    private int id;
    private String nombre;
    private String raza;

    public static void main(String[] args) {
        Perro pe= new Perro();
        pe.getId();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre()
    {
        return this.nombre;
    }
    String getNombreRaza()
    {
        return this.nombre + ""+this.raza;
    }
    private int getId()
    {
        return this.id;
    }
}
