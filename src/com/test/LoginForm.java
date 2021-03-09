package com.test;

import com.sun.org.apache.xpath.internal.objects.XString;

public class LoginForm {
    public static void init() {
        System.out.println("初始化成功！");
    }

    public static void display() {
        System.out.println("控件显示成功！");
    }
    public static void validate() {
        String userName = "123";
        String userPwd = "123";
        if(UserDAO.findUser(userName,userPwd))
        System.out.println("登录成功！\n欢迎用户："+userName);
        else System.out.println("该用户不存在！");
    }
}
