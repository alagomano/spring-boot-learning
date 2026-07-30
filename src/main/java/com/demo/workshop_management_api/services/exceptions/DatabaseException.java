package com.demo.workshop_management_api.services.exceptions;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String msg){
        super(msg);
    }
}
