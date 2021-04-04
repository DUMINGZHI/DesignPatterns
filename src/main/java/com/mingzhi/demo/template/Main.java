package com.mingzhi.demo.template;

public class Main {
    public static void main(String[] args) {
        Potato potato = new Potato();
        Tomato tomato = new Tomato();
        potato.startCook();
        System.out.println();
        tomato.startCook();
    }
}
