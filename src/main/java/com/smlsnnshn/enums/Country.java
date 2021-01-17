package com.smlsnnshn.enums;

public enum Country {

    USA("USA"), UK("UK"), SPAIN("Spain"), GERMANY("Germany"), BELGIUM("Belgium"), ITALY("Italy"),
    TURKEY("Turkey"), NETHERLAND("Netherland"), FRANCE("France");

    private String value;

    private Country(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}

