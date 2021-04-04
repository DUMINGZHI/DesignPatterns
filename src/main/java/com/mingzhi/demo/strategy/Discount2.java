package com.mingzhi.demo.strategy;

public class Discount2 implements StrategyInterface{
    public int discount(int i) {
        System.out.println("5折");
        return (int) (i * 0.5);
    }
}
