package com.linghua.zawu;

import java.util.Stack;

public class xiaomi {
    public static void main(String[] args) {
        String str = "2[abc]3[cd]ef";
        System.out.println(decodeString(str));
    }


    /**
     *  s = “3[a]2[bc]”, return “aaabcbc”.
        s = “3[a2[c]]”, return “accaccacc”.
        s = “2[abc]3[cd]ef”, return “abcabccdcdcdef”.
     * @param s
     * @return
     */
    public static String decodeString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<Character>();
        String result = "";
        String temp = "";
        for (int i = 0; i < n; i ++) {
            char str = s.charAt(i);
            if (str != ']') {
                stack.push(str);
            } else {
                char ch = stack.pop();
                while (ch != '[') {
                    temp = ch + temp;
                    ch = stack.pop();
                }
                //字符串重复次数
                String times = "";
                while(!stack.isEmpty()) {
                    ch = stack.pop();
                    if(Character.isDigit(ch)) {
                        times = ch + times;
                    }else {
                        stack.push(ch);
                        break;
                    }
                }
                //重复字符串，压入栈中
                for(int j = 0; j < Integer.parseInt(times); j++) {
                    for(int k = 0; k < temp.length(); k++) {
                        stack.push(temp.charAt(k));
                    }
                }
                temp = "";
            }
        }
        while(!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
}
