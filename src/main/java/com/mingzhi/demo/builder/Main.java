package com.mingzhi.demo.builder;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder().ageMoneyBuild(24,15000).nameSexBuild("dmz","M").build();
        Person p1 = new Person.PersonBuilder().ageMoneyBuild(26,25000).build();
        System.out.println(p);
        System.out.println(p1);
    }
}
