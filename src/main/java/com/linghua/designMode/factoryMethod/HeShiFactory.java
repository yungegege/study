package com.linghua.designMode.factoryMethod;

public class HeShiFactory implements SchoolFactory {
    @Override
    public School createSchool() {
        return new HeShi();
    }
}
