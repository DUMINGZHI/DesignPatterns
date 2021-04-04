package com.mingzhi.demo.adapter;

public class ClassAdapter extends Adaptee implements Target {
    public void advancedSay() {
        this.say();
        System.out.println("ClassAdapter .... AdvancedSay...");
    }
}
