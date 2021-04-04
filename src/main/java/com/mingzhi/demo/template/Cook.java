package com.mingzhi.demo.template;

public abstract class Cook {
    final void startCook(){
        this.oil();
        this.fire();
        this.vegetable();
        this.sauce();
        this.fry();
    }
    void oil(){
        System.out.println("oil....");
    }
    void fire(){
        System.out.println("fire....");
    }
    void fry(){
        System.out.println("fry....");
    }

    abstract void vegetable();
    abstract void sauce();
}
