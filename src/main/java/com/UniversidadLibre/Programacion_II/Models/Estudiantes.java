package com.UniversidadLibre.Programacion_II.Models;
public class Estudiantes {
    private int id;

//Indica que el atributo es una columna de la talba, nullabel=false indica que no puede ser vacio
    private String nombre;


    private String email;


    private String Contraseña;

    public Estudiantes() {
    }

    // Constructor
    public Estudiantes(int id,String nombre, String email, String contraseña) {
        this.id=id;
        this.nombre = nombre;
        this.email = email;
        this.Contraseña = contraseña;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        this.Contraseña = contraseña;
    }
}
