package com.linghua.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现InvocationHandler接口。构造时传入被代理对象，赋值给obj，并重写invoke方法。代理这个被代理对象
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object target;
    private MyAspect ma = new MyAspect();

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ma.before();
        method.invoke(target,args);            //利用反射执行被代理对象的方法
        ma.after();
        return null;
    }
}
