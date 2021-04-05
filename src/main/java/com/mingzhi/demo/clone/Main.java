package com.mingzhi.demo.clone;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();

        SourceObject2 sourceObject = new SourceObject2();
        sourceObject.setName("1");
        sourceObject.setDate(date);
        System.out.println("sourceObject -> " + sourceObject);

        SourceObject2 clone = (SourceObject2) sourceObject.clone();
        System.out.println("clone -> " + clone);


        date.setTime(12312);
        System.out.println("sourceObject change date-> " + sourceObject);
        System.out.println("clone -> " + clone);



    }
}
