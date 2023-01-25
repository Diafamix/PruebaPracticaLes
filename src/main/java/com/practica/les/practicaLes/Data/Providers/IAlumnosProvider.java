package com.practica.les.practicaLes.Data.Providers;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.dtos.AlumnosDto;

import java.util.List;

public interface IAlumnosProvider {

    List<AlumnosDto> getAlumnos();

    AlumnosModel createAlumno(Integer id, String nombre, String apellidos);
}
