package com.practica.les.practicaLes.Data.Dao;

import com.practica.les.practicaLes.Data.Entities.AlumnosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnosDao extends JpaRepository<AlumnosModel, Integer> {

    //Magia de Spring aqui crea las consultas
    // insert select ....
}
