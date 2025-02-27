package com.UniversidadLibre.Programacion_II.Services;
import com.UniversidadLibre.Programacion_II.Models.Profesores;
import com.UniversidadLibre.Programacion_II.Models.Tareas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.UniversidadLibre.Programacion_II.Models.Estudiantes;
import org.springframework.stereotype.Service;


@Service
public class EstudiantesServices {

    private List<Estudiantes> estudiantes = new ArrayList<>(Arrays.asList(
            new Estudiantes(1,"Nicolas","nicolas123@gmail.com","1234"),
            new Estudiantes(2, "Thomas", "thomas123@gmail.com", "456"),
            new Estudiantes(3, "Cristian", "cristian123", "789")
    ));

    public List<Estudiantes> GetEstudiantes() {
        return estudiantes;
    }

    public void PostEstudiantes(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public void DeleteEstudiantes(int id )
    {
        for(Estudiantes e : estudiantes)
        {
            if(e.getId() == id)
            {
                estudiantes.remove(e);
            }
        }
    }
    public boolean InicioSesion(String email, String contraseña)
    {
        for (Estudiantes e : estudiantes)
        {
            if(e.getEmail().equals(email) && e.getContraseña().equals(contraseña))
                return true;
        }
        return false;
    }




}


