package com.mingzhi.demo.strategy;

public class Shop {
    public static void main(String[] args) {
        Person person1 = new Person(new Discount2());
        Person person2 = new Person(new Discount3());

        System.out.println(person1.discount(5000));
        System.out.println(person2.discount(5000));
    }
}
