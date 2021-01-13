package com.smlsnnshn.enums;

public enum StudentWorkingStatus {

    NOT_WORKING("Not Working"), PART_TIME("Part Time"), FULL_TIME("Full Time");

    private final String value;

    private StudentWorkingStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
