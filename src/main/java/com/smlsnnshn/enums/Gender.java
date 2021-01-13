package com.smlsnnshn.enums;

public enum Gender {

    FEMALE("Female"), MALE("Male");

    private String value;

    private Gender(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
