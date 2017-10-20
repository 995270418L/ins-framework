package com.steve.framework.exception;

import java.io.Serializable;

public class FieldError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;

    private String fieldName;

    public FieldError(){
    }

    public FieldError(String fieldName){
        this.fieldName = fieldName;
    }

    public FieldError(String fieldName, String message){
        this.fieldName = fieldName;
        this.message = message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
