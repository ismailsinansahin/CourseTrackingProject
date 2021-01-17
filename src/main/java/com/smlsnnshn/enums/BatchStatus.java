package com.smlsnnshn.enums;

public enum BatchStatus {

    ACTIVE("Active"), COMPLETED("Completed");

    private String value;

    private BatchStatus(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
