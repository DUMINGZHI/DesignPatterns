package com.mingzhi.demo.adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.advancedSay();

        Target target1  = new ClassAdapter();
        target.advancedSay();
    }
}
