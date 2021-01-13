package com.smlsnnshn.enums;

public enum MentorWorkingStatus {

    FULL_TIME("Full Time"), PART_TIME("Part Time");

    private String value;

    private MentorWorkingStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
