package com.practica.les.practicaLes.core.Services.impl;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;

import java.util.List;

public interface IAlumnosService {

    List<AlumnosModel> mostrarAlumnos();

    AlumnosModel crearAlumno(Integer id, String nombre, String apellido);
}
