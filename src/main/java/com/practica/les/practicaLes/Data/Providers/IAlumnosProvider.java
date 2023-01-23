package com.practica.les.practicaLes.Data.Providers;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;

import java.util.List;

public interface IAlumnosProvider {

    List<AlumnosModel> getAlumnos();

    AlumnosModel createAlumno(Integer id, String nombre, String apellidos);
}
