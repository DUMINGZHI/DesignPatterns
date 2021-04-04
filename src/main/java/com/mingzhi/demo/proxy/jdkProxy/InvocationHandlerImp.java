package com.mingzhi.demo.proxy.jdkProxy;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImp implements InvocationHandler {
    private Object object;
    public InvocationHandlerImp(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object returnValue = method.invoke(object,args);
        System.out.println("after");
        return returnValue;
    }
}
