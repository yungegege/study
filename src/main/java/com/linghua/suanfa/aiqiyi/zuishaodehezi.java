package com.linghua.suanfa.aiqiyi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class zuishaodehezi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();

            ArrayList<BigDecimal> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                BigDecimal a = sc.nextBigDecimal();
                list.add(a);
            }
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                int count=0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i)==list.get(j)){
                        count++;
                    }
                }
                if (max<count){
                    max = count;
                }
            }
            System.out.println(max);
        }
    }
}
