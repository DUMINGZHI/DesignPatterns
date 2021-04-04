package com.mingzhi.demo.adapter;

public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void advancedSay() {
        System.out.println("ObjectAdapter .... AdvancedSay...");
        adaptee.say();
    }
}
