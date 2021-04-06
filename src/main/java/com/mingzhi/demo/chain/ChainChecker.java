package com.mingzhi.demo.chain;

import java.util.List;

public class ChainChecker implements ChainItem{
    private List<ChainItem> chainItemList;

    public ChainChecker(List<ChainItem> chainItemList){
        this.chainItemList = chainItemList;
    }

    private int index = 0;


    public boolean check() {
        if(index < chainItemList.size()){
            boolean check = chainItemList.get(index++).check();
            if(check){
                this.check();
            }else return false;
        }
        System.out.println("all check done....");
        return true;
    }
}
