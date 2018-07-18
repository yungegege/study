package com.linghua.designMode.factoryMethod;

public class ChengChengFactory implements SchoolFactory {
    @Override
    public School createSchool() {
        return new ChengCheng();
    }
}
