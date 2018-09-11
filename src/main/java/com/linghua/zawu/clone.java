package com.linghua.zawu;

public class clone implements Cloneable{  // implements Cloneable
    public String name = "1";
    public static void main(String[] args) {
        clone c = new clone();
        Object obj = c.clone();
        System.out.println(obj);
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return obj;
    }
}
