package com.mingzhi.demo.strategy;

public class Discount1 implements StrategyInterface{
    public int discount(int i) {
        System.out.println("无折扣");
        return i;
    }
}
