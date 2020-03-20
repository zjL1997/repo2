package com.zjl.service.Impl;

import com.zjl.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {
    private String[] myStr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myPro;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    public void saveAccount() {

        System.out.println("saveAccount方法执行了");
        System.out.println(myStr.toString());
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myPro);
    }


    void init(){
        System.out.println("对象被初始化了");
    }
    void destory(){
        System.out.println("对象被销毁了");
    }
}
