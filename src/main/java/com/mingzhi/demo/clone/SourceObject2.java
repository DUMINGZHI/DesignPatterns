package com.mingzhi.demo.clone;

import java.util.Date;

/**
 * 深克隆 成员变量也克隆
 */
public class SourceObject2 implements Cloneable{

    private String name;
    private Date date;

    public SourceObject2(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SourceObject2 clone = (SourceObject2) super.clone();
        clone.date = (Date) this.date.clone();
        return clone;
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
