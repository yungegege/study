package com.linghua.suanfa.tengxun;

import java.util.ArrayList;
import java.util.Scanner;

public class mingongbeishu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int amax = 1;
            int bmax = 1;
            ArrayList<Integer> alist = new ArrayList<>();
            ArrayList<Integer> blist = new ArrayList<>();
            for (int m = n + 1; m < 10000; m++) {
                for (int i = 0; i < m; i++) {
                    alist.add(i + 1);
                }
                for (int i = 0; i < m - n; i++) {
                    blist.add(n + i + 1);
                }

                //a的最小公倍数
                for (amax = 1; amax<10000; amax++) {
                    boolean flag1 = true;    //设置标记
                    for (int i = 0; i < alist.size(); i++) {
                        if (amax % alist.get(i) != 0) {
                            flag1 = false;
                        }
                    }
                    if (flag1) {    //如果标记为true说明该max可以整除这n个数
                        break;    //跳出循环
                    }
                }
                //b的最小公倍数
                for (bmax = 1; bmax<10000; bmax++) {
                    boolean flag2 = true;    //设置标记
                    for (int i = 0; i < blist.size(); i++) {
                        if (bmax % blist.get(i) != 0) {
                            flag2 = false;
                        }
                    }
                    if (flag2) {    //如果标记为true说明该max可以整除这n个数
                        break;    //跳出循环
                    }
                }


                if (amax == bmax) {
                    System.out.println(m);
                    break;
                }
                alist.clear();
                blist.clear();

            }

        }
    }
}
