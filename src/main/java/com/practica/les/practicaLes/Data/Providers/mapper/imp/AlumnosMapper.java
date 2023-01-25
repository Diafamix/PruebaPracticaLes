package com.practica.les.practicaLes.Data.Providers.mapper.imp;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import com.practica.les.practicaLes.Data.Providers.mapper.IMapper;
import com.practica.les.practicaLes.dtos.AlumnosDto;
import org.springframework.stereotype.Component;

@Component
public class AlumnosMapper implements IMapper<AlumnosModel, AlumnosDto> {

    @Override
    public AlumnosDto mapToDto(AlumnosModel alumnosModel) {
        return AlumnosDto.builder()
                .id(alumnosModel.getId())
                .nombre(alumnosModel.getNombre())
                .apellidos(alumnosModel.getApellidos())
                .profesorId(alumnosModel.getProfesorModel().getId())
                .build();
    }

    @Override
    public AlumnosModel mapToEntity(AlumnosDto alumnosDto) {
        return null;
    }
}
