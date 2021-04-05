package com.mingzhi.demo.iterator;

public class Main {
    public static void main(String[] args) {
        MyInterator myInterator = new MyInterator();
        while(myInterator.hasNext()){
            System.out.println(myInterator.next());
        }
        System.out.println("12");
    }
}
