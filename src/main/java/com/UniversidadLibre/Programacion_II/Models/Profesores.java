package com.UniversidadLibre.Programacion_II.Models;
public class Profesores {

    private int id;
    private String nombre;

    private String email;
    private String contraseña;
    public Profesores() {}
    public Profesores(int id, String nombre, String email, String contraseña) {
        this.id=id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

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
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
