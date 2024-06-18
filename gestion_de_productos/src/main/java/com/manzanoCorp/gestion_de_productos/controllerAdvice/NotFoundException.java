package com.manzanoCorp.gestion_de_productos.controllerAdvice;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}
