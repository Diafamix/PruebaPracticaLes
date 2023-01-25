package com.practica.les.practicaLes.Data.Providers.impl;

import com.practica.les.practicaLes.Data.Dao.IAlumnosDao;
import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.Data.Providers.IAlumnosProvider;
import com.practica.les.practicaLes.Data.Providers.mapper.IMapper;
import com.practica.les.practicaLes.dtos.AlumnosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
// El provider trabja con los DAO QUE SON LA CONSULTAS A LA BASE DE DATOS
// Y CON LAS ENTITIES QUE SON LAS TABLAS
// ES EL UNICO QUE TRABAJA CON ESTO
public class ProviderAlumnos implements IAlumnosProvider {

    // DAO
    private final IAlumnosDao iAlumnosDao;
    private final IMapper<AlumnosModel, AlumnosDto> mapperAlumnos;

    public List<AlumnosDto> getAlumnos(){

        return iAlumnosDao.findAll().stream()
                .map(mapperAlumnos::mapToDto)
                .collect(Collectors.toList());
    }

    public AlumnosModel createAlumno(Integer id, String nombre, String apellidos) {
        //AlumnosModel newAlumno = new AlumnosModel(id, nombre, apellidos);
        return null;
    }

}
