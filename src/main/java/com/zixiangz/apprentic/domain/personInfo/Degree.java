package com.zixiangz.apprentic.domain.personInfo;

public enum Degree {
    NONE("High school or below"),
    ASSOCIATE("Associate"),
    BACHELOR("Bachelor"),
    MASTER("Master"),
    DOCTOR("Doctor");

    private final String name;
    Degree(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
}
