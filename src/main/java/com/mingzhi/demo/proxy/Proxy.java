package com.mingzhi.demo.proxy;

public class Proxy implements Say{
    public void say(){
        ReallyObject reallyObject = new ReallyObject();
        this.beforeWrapper();
        reallyObject.say();
        this.afterWrapper();
    }

    private void beforeWrapper() {
        System.out.println("Proxy....beforeWrapper");
    }

    private void afterWrapper() {
        System.out.println("Proxy....afterWrapper");
    }
}
