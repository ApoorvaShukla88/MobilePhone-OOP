package com.dtcc.projects;

public class IPhone extends MobilePhone{

    boolean haveFrontCamera;
    boolean haveBackCamera;
    boolean flash;

    public boolean isHaveFrontCamera() {
        return true;
    }



    public boolean isHaveBackCamera() {
        return true;
    }




    public boolean isFlash() {
        return true;
    }


    public String ringTone() {
        return "iphoneRingtone";
    }

    public String ops() {
        return "ios";
    }
}
