// 本题为考试多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

public class niuniunanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aaa = sc.nextInt();

        for (int i = 0; i < aaa; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            lll(a,b,c);

        }


    }

    public static void lll(int a,int b,int c){
        for (int n = 0; n < 1000; n++) {
            for (int m = 1; m < 1000; m++) {
                if ((c + b * n) == a * m) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}