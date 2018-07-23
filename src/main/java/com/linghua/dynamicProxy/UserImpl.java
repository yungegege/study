package com.linghua.dynamicProxy;

public class UserImpl implements User{
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
