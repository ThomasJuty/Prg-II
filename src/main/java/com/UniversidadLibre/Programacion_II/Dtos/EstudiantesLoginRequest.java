package com.UniversidadLibre.Programacion_II.Dtos;

public class EstudiantesLoginRequest {
    private String email;
    private String contraseña;

    public EstudiantesLoginRequest(String contraseña, String email) {
        this.contraseña = contraseña;
        this.email = email;
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
