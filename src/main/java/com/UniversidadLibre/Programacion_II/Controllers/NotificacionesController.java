package com.UniversidadLibre.Programacion_II.Controllers;

import com.UniversidadLibre.Programacion_II.Models.Tareas;
import com.UniversidadLibre.Programacion_II.Services.ProfesoresServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Ajusta según el puerto de tu frontend
@RequestMapping("/Notificaciones")
public class NotificacionesController {
    private final ProfesoresServices profesoresServices;

    public NotificacionesController(ProfesoresServices profesoresServices) {
        this.profesoresServices = profesoresServices;
    }

    @GetMapping("/ListaNotificaciones")
    public List<String> obtenerNotificaciones() {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaProxima = fechaHoy.plusDays(1);
        List<Tareas> tareas = profesoresServices.ObtenerTareas();
        List<String> notificaciones = new ArrayList<>();

        if (tareas != null) {
            for (Tareas tarea : tareas) {
                if (tarea.getFechaEntrega() != null && tarea.getFechaEntrega().isEqual(fechaProxima)) {
                    notificaciones.add("La tarea: " + tarea.getTitulo() + " está próxima a entrega.");
                }
            }
        }

        return notificaciones;
    }
}

