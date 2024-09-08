package com.ap.microserver.factura.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "facturas")
@Data
public class Factura {

    @Id
    private String id;
    private String clienteId;
    private double monto;
    private LocalDate fecha;

}
