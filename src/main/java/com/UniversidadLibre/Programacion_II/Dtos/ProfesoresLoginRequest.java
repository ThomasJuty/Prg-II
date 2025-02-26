package com.UniversidadLibre.Programacion_II.Dtos;

public class ProfesoresLoginRequest {
    private String email;
    private String contraseña;

    public ProfesoresLoginRequest(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
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
