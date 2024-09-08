package com.ap.Empleados.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ap.Empleados.microserver.entity.Empleados;


public interface EmpleadosRepository extends MongoRepository<Empleados, String> {

}
