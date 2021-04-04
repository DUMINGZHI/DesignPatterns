package com.mingzhi.demo.strategy;

public class Discount3 implements StrategyInterface{
    public int discount(int i) {
        System.out.println("1折");
        return (int) (i * 0.1);
    }
}
