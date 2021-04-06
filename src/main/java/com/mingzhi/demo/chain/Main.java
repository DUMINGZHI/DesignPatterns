package com.mingzhi.demo.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoginCheck loginCheck = new LoginCheck();
        AdminCheck adminCheck = new AdminCheck();
        LoginCheck loginCheck1 = new LoginCheck();
        List<ChainItem> list = new ArrayList<ChainItem>();
        list.add(loginCheck);
        list.add(adminCheck);
        list.add(loginCheck1);
        ChainChecker chainChecker = new ChainChecker(list);
        chainChecker.check();
    }
}
