package com.mingzhi.demo.clone;

import java.util.Date;

/**
 * 浅克隆 Date date成员变量 克隆体和原对象都指向的同一个
 */
public class SourceObject implements Cloneable{

    private String name;
    private Date date;

    public SourceObject(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SourceObject{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
