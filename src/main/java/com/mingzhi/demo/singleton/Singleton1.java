package com.mingzhi.demo.singleton;

/**
 * 通过静态内部类的方式实现单例模式是线程安全的
 * 同时静态内部类不会在Singleton1类加载时就加载
 * 而是在调用getInstance()方法时才进行加载，达到了懒加载的效果。
 */
public class Singleton1 {

    private Singleton1(){};

    private static class SingletonHolder{
        private static Singleton1 instance = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.instance;
    }
}
