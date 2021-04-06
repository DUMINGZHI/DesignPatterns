package com.mingzhi.demo.chain;

public class AdminCheck implements ChainItem{
    public boolean check() {
        System.out.println("AdminCheck");
        return true;
    }
}
