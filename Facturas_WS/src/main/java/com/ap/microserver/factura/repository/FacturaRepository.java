package com.ap.microserver.factura.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ap.microserver.factura.entity.Factura;

public interface FacturaRepository extends MongoRepository<Factura, String> {

}
