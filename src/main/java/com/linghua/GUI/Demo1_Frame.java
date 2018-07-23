package com.linghua.GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo1_Frame {

    public static  void main(String[] args){
        Frame f = new Frame("贪玩蓝月");
        f.setSize(400,600);               //设置窗体大小
        f.setLocation(800,100);                   //设置窗体位置
        f.setIconImage(Toolkit.getDefaultToolkit().createImage("wechatpay.jpg"));

        Button b1 = new Button("adddqwfweg");
        f.add(b1);
        f.setLayout(new FlowLayout());                 //设置布局管理器

//        f.addWindowListener(new MyWindowsListener());  //窗口监听
//        f.addWindowListener(new MyWindowsAdapter());
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        f.setVisible(true);                            //设置窗体可见



    }
}
