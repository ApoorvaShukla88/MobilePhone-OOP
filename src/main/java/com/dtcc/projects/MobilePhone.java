package com.dtcc.projects;

public abstract class MobilePhone {

    String carrrierType;
    long phoneNumber;
    int memory;

    public int getMemory(){
        return 5;
    }

    public long getPhoneNumber(){
        return 1234567891;
    }

    public String getCarrrierType(){
        return "Verizon";
    }

    public abstract String ringTone();
    public abstract String ops();

}
