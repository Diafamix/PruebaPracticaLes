package com.practica.les.practicaLes.Data.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
// Para cambiar el nombre de la tabla en la base de datos
@Table(name = "ALUMNOS")
public class AlumnosModel {

    @Id
    private int id;
    private String nombre;
    private String apellidos;

    @ManyToOne
    private  ProfesorModel profesorModel;

}
