package com.practica.les.practicaLes.core.Services;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.Data.Providers.IAlumnosProvider;
import com.practica.les.practicaLes.core.Services.impl.IAlumnosService;
import com.practica.les.practicaLes.dtos.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlumnosService implements IAlumnosService {

    private final IAlumnosProvider alumnosProvider;

    public List<AlumnosDto> mostrarAlumnos() {
        return alumnosProvider.getAlumnos();
    }

    public AlumnosModel crearAlumno(Integer id, String nombre, String apellido) {
        return alumnosProvider.createAlumno(id, nombre, apellido);
    }
}
