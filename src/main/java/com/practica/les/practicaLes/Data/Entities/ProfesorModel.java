package com.practica.les.practicaLes.Data.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Crea la PERSISTENCIA -> Lo mete en la base de datos
@Entity
//Crear los get set y constructores
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "PROFESOR")
public class ProfesorModel {

    @Id
    public long id;
    public String nombre;
    public String apellido;

}
