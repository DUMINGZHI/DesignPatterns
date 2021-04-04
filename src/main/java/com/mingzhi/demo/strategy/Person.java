package com.mingzhi.demo.strategy;

public class Person {
    private StrategyInterface strategyInterface;

    public Person(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public double discount(int price){
        return this.strategyInterface.discount(price);
    }
}
