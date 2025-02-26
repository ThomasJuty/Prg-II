package com.UniversidadLibre.Programacion_II.Controllers;

import com.UniversidadLibre.Programacion_II.Dtos.EstudiantesLoginRequest;
import com.UniversidadLibre.Programacion_II.Dtos.ProfesoresLoginRequest;
import com.UniversidadLibre.Programacion_II.Models.Estudiantes;
import com.UniversidadLibre.Programacion_II.Models.Profesores;
import com.UniversidadLibre.Programacion_II.Services.EstudiantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @CrossOrigin(origins = "*")
    @RestController
    @RequestMapping("Estudiantes")

    public class EstudiantesController {

        @Autowired
        private EstudiantesServices estudiantesServices;

        @PostMapping("/Login")
        public ResponseEntity<String> Login(@RequestBody EstudiantesLoginRequest request) {
            boolean autenticado = estudiantesServices.InicioSesion(request.getEmail(), request.getContraseña());

            if (autenticado) {
                return ResponseEntity.ok("{\"mensaje\": \"Se ha logeado correctamente\"}");
            } else {
                return ResponseEntity.badRequest().body("{\"mensaje\": \"Usuario Incorrecto\"}");
            }
        }


    }
