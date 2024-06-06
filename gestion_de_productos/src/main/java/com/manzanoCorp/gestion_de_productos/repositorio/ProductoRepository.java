package com.manzanoCorp.gestion_de_productos.repositorio;

import com.manzanoCorp.gestion_de_productos.modelo.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {

}
