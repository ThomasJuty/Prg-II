package com.UniversidadLibre.Programacion_II.Services;


import com.UniversidadLibre.Programacion_II.Models.Profesores;
import com.UniversidadLibre.Programacion_II.Models.Tareas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesoresServices {
    private List<Profesores> profesores = new ArrayList<>(Arrays.asList(
            new Profesores(1,"thomas","thomasjuty@gmail.com","1234"),
            new Profesores(2, "María", "maria.lopez@gmail.com", "456"),
            new Profesores(3, "Carlos", "carlos.mendez@gmail.com", "789"),
            new Profesores(4, "Andrea", "andrea.suarez@gmail.com", "101")
    ));
    private List<Tareas> tareas = new ArrayList<>();

    public List<Profesores> getProfesores()
    {
        return profesores;
    }
    public void EliminarProfesores(int id )
    {
        for(Profesores p : profesores)
        {
            if(p.getId() == id)
            {
                profesores.remove(p);
            }
        }
    }
    public String PostProfesores(Profesores profesor)
    {
        profesores.add(profesor);
        return "Profesor añadido con exito";
    }

    public boolean InicioSesion(String email, String contraseña)
    {
        for (Profesores p : profesores)
        {
            if(p.getEmail().equals(email) && p.getContraseña().equals(contraseña))
                return true;
        }
        return false;
    }
    //Metodos Tareas



    // Agregar tarea
    public Tareas AgregarTarea(Tareas tarea) {
        tarea.setId(tareas.size() + 1); // Asigna un ID secuencial
        tareas.add(tarea);
        return tarea;
    }

    // Obtener todas las tareas
    public List<Tareas> ObtenerTareas() {
        return tareas;
    }

    // Editar tarea
    public Optional<Tareas> EditarTarea(int id, Tareas tareaActualizada) {
        for (Tareas tarea : tareas) {
            if (tarea.getId() == id) {
                // Actualizar el atributo si no es nulo
                if (tareaActualizada.getTitulo() != null) tarea.setTitulo(tareaActualizada.getTitulo());
                if (tareaActualizada.getDescripcion() != null) tarea.setDescripcion(tareaActualizada.getDescripcion());
                if (tareaActualizada.getFechaEntrega() != null) tarea.setFechaEntrega(tareaActualizada.getFechaEntrega());
                if (tareaActualizada.getMateria() != null) tarea.setMateria(tareaActualizada.getMateria());
                if (tareaActualizada.getEstado() != null) tarea.setEstado(tareaActualizada.getEstado());

                return Optional.of(tarea); // Devuelve la tarea actualizada
            }
        }
        return Optional.empty(); // Retorna vacío si no se encontró la tarea
    }


    // Eliminar tarea
    public boolean EliminarTarea(int id) {
        return tareas.removeIf(t -> t.getId() == id);
    }

}
