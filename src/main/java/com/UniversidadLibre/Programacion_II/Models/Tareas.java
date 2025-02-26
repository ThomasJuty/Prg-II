package com.UniversidadLibre.Programacion_II.Models;

import java.time.LocalDate;

public class Tareas {

    private int id;
    private String materia;

    private String titulo;
    private String descripcion;

    private LocalDate fechaEntrega;

    public enum EstadoTarea {
        PENDIENTE,
        EN_PROGRESO,
        COMPLETADA
    }

    public Tareas(int id, String materia,String titulo, String descripcion, LocalDate fechaEntrega, EstadoTarea estado) {
        this.id = id;
        this.materia = materia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.estado = EstadoTarea.PENDIENTE;

    }
    private EstadoTarea estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
