package com.mingzhi.demo.chain;

public class LoginCheck implements ChainItem{
    public boolean check() {
        System.out.println("LoginCheck");
        return true;
    }
}
