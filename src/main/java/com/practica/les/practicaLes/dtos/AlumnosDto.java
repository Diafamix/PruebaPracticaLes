package com.practica.les.practicaLes.dtos;

import com.practica.les.practicaLes.Data.Entities.ProfesorModel;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AlumnosDto {

    private int id;
    private String nombre;
    private String apellidos;
    private Long profesorId;
}
