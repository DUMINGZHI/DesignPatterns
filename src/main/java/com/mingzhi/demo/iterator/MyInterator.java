package com.mingzhi.demo.iterator;

public class MyInterator implements Iterator{
    String[] names = new String[]{"dmz", "mingzhi","dmin"};
    int index = 0;

    public boolean hasNext() {
        if(index<names.length) return true;
        else return false;
    }

    public Object next() {
        if(this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}
