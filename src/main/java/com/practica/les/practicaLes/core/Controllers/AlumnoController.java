package com.practica.les.practicaLes.core.Controllers;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.core.Services.AlumnosService;
import com.practica.les.practicaLes.core.Services.impl.IAlumnosService;
import com.practica.les.practicaLes.dtos.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/alumnos")
public class AlumnoController {

    private final IAlumnosService alumnosService;

    @GetMapping("/lista")
    public List<AlumnosDto> selectAlumnos() {
        return alumnosService.mostrarAlumnos();
    }

    @PostMapping("/crear")
    public AlumnosModel insertAlumnos(@PathVariable int id, @PathVariable String nombre, @PathVariable String apellido) {
        return alumnosService.crearAlumno(id, nombre, apellido);
    }
}
