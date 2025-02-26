package com.UniversidadLibre.Programacion_II.Controllers;

import com.UniversidadLibre.Programacion_II.Dtos.ProfesoresLoginRequest;
import com.UniversidadLibre.Programacion_II.Models.Profesores;
import com.UniversidadLibre.Programacion_II.Models.Tareas;
import com.UniversidadLibre.Programacion_II.Services.ProfesoresServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.CrossOrigin;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Profesores")

public class ProfesoresController {

    private final ProfesoresServices profesoresServices;

    public ProfesoresController(ProfesoresServices profesoresServices) {
        this.profesoresServices = profesoresServices;
    }
    @GetMapping("/GetTareas")
    public ResponseEntity<List<Tareas>> getTareas() {
        List<Tareas> tareas = profesoresServices.ObtenerTareas();
        return ResponseEntity.ok(tareas);
    }


    @PostMapping("/Login")
    public ResponseEntity<?> Login(@RequestBody ProfesoresLoginRequest request) {
        boolean autenticado = profesoresServices.InicioSesion(request.getEmail(), request.getContraseña());

        if (autenticado) {
            return ResponseEntity.ok().body("{\"mensaje\": \"Se ha logeado correctamente\"}");
        } else {
            return ResponseEntity.badRequest().body("{\"mensaje\": \"Usuario Incorrecto\"}");
        }
    }



    @PostMapping("/AgregarTareas")
    public Tareas AgregarTarea(@RequestBody Tareas tarea)
    {
        profesoresServices.AgregarTarea(tarea);
        return tarea;
    }
    @DeleteMapping("/DeleteTareas/{id}")
    public String DeleteTareas(@PathVariable int id )
    {
        profesoresServices.EliminarTarea(id);
        return "Tarea eliminada";
    }
    @PatchMapping("/EditarTareas/{id}")
    public Tareas EditarTareas (@PathVariable int id, @RequestBody Tareas tarea )
    {
        profesoresServices.EditarTarea(id,tarea);
        return tarea;
    }

}
