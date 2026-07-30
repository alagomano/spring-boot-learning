package com.demo.workshop_management_api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
