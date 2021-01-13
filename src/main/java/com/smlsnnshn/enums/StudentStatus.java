package com.smlsnnshn.enums;

public enum StudentStatus {

    NEW("New"), RETAKING("Retaking"), RETURNING("Returning");

    private String value;

    private StudentStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
