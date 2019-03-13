package com.linghua.suanfa.xiapi;

import java.util.*;

public class strbianyi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String line = in.nextLine();
            String name = "<% name %>";
            String gender = "<% gender %>";
            int ncount = 0;
            int gcount = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '<') {
                    if (line.charAt(i + 3) == 'n') {
                        for (int j = 0; j < name.length(); j++) {
                            if (line.charAt(i + j) == name.charAt(j) && i + j < line.length()) {
                                ncount++;
                            }
                        }
                        if (ncount == 10) {  //替换
                            sb.append("Han Meimei");
                            i += 10;
                        }
                    } else if (line.charAt(i + 3) == 'g') {
                        for (int j = 0; j < gender.length(); j++) {
                            if (line.charAt(i + j) == gender.charAt(j) && i + j < line.length()) {
                                gcount++;
                            }
                        }
                        if (gcount == 12) {
                            sb.append("男");
                            i += 12;
                        }
                    }
                }
                sb.append(line.charAt(i));


            }
            System.out.println(sb.toString());
        }
    }
}
