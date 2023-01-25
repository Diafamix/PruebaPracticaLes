package com.practica.les.practicaLes.core.Services.impl;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.dtos.AlumnosDto;

import java.util.List;

public interface IAlumnosService {

    List<AlumnosDto> mostrarAlumnos();

    AlumnosModel crearAlumno(Integer id, String nombre, String apellido);
}
