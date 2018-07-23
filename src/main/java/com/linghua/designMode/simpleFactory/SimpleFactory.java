package com.linghua.designMode.simpleFactory;

public class SimpleFactory {
    public School getschool(String name){

        if(name == "chengcheng"){
            return new ChengCheng();
        }else if(name=="yizhong"){
            return new YiZhong();
        }
        return new HeShi();


    }
}
