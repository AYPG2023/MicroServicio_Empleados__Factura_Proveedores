package com.ap.Empleados.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "empleados")
@Data
public class Empleados {
	
	@Id
    private String id;
    private String nombre;
    private String puesto;
    private String salario;

}
