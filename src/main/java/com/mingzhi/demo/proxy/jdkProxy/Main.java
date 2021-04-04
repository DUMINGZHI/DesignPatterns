package com.mingzhi.demo.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy();
        InvocationHandler invocationHandler = new InvocationHandlerImp(boy);
        ClassLoader loader = boy.getClass().getClassLoader();
        Class<?>[] interfaces = boy.getClass().getInterfaces();
        Common common = (Common) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        common.cry();
        System.out.println();
        common.say();
    }
}
