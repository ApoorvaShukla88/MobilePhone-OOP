package com.dtcc.projects;

public class Samsung extends MobilePhone{

    boolean haveFrontCamera;
    boolean haveBackCamera;
    boolean flash;

    public boolean isHaveFrontCamera() {
        return false;
    }



    public boolean isHaveBackCamera() {
        return false;
    }

    public boolean isFlash() {
        return false;
    }

    public String ringTone() {
        return "SamsungRingtone";
    }

    public String ops() {
        return "Android";
    }
}
