package com.practica.les.practicaLes.Data.Providers.impl;

import com.practica.les.practicaLes.Data.Dao.IAlumnosDao;
import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.Data.Providers.IAlumnosProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProviderAlumnos implements IAlumnosProvider {

    private final IAlumnosDao iAlumnosDao;

    public List<AlumnosModel> getAlumnos(){
        return iAlumnosDao.findAll();
    }

    public AlumnosModel createAlumno(Integer id, String nombre, String apellidos) {
        AlumnosModel newAlumno = new AlumnosModel(id, nombre, apellidos);
        return iAlumnosDao.save(newAlumno);
    }

}
