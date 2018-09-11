package com.linghua.threads.thread;

import java.io.IOException;

public class Demo10_Runtime {
    /**
     *
     */
    public static void main(String[] args) throws IOException{

        Runtime r = Runtime.getRuntime();     //获取运行时对象
        r.exec("shutdown -s -t 600");   //600秒后关机
        System.out.println("600秒后关机");
        r.exec("shutdown -a");          //取消
        System.out.println("取消关机");

    }
}
