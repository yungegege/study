package com.linghua.designMode.factoryMethod;

public class YiZhongFactory implements SchoolFactory {
    @Override
    public School createSchool() {
        return new YiZhong();
    }
}
