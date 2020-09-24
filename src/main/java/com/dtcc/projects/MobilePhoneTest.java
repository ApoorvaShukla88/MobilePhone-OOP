package com.dtcc.projects;

public class MobilePhoneTest {
    public static void main(String[] args){

        IPhone iphone = new IPhone();
        Samsung samsung = new Samsung();

        System.out.println("Iphone properties : " + "carrrierType : " + iphone.getCarrrierType() + ", " +
                "haveBackCamera : "+ iphone.isHaveBackCamera() + " , " + "haveFrontCamera : " +
                iphone.isHaveFrontCamera() + "," + "OPS "+ iphone.ops());
        System.out.println();
        System.out.println("Samsung properties : " + "carrrierType : " + samsung.getCarrrierType() + ", " +
                        "haveBackCamera : "+samsung.isHaveBackCamera() + " , " + "haveFrontCamera : " +
                samsung.isHaveFrontCamera() + "," + " OPS "+ samsung.ops());

    }
}
