package com.zjl.service.Impl;

import com.zjl.service.AccountService;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService {
    //如果数据经常变化，并不适用注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("saveAccount方法执行了"+name+","+age+","+birthday);
    }
    void init(){
        System.out.println("对象被初始化了");
    }
    void destory(){
        System.out.println("对象被销毁了");
    }
}
