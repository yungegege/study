package com.linghua.GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 用哪个方法就重写哪个方法
 */
public class MyWindowsAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}
