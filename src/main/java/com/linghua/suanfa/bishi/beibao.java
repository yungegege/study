package com.linghua.suanfa.bishi;

public class beibao {
    public static void main(String[] args) {
        int money[] = {1,2,3,5};
        int miane = 20;
        long dp[][] = new long[money.length][miane+1];
        for (int i=0;i<money.length;i++){
            dp[i][0] = 1;
            for (int j = 1; j <= miane ; j++) {
                if(i>0){
                    if (j<money[i]){
                        dp[i][j] = dp[i-1][j];
                    }else {
                        dp[i][j] = dp[i-1][j] + dp[i][j-money[i]];
                    }
                }else {
                    if (j%money[0]==0){
                        dp[0][j] = 1;
                    }
                }
            }
        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 21; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(dp[money.length-1][miane]);

        a();

    }

    public static void a(){
        int money[] = {1,2,3,5};
        int miane = 20;
        long dp[] = new long[miane+1];

        dp[0] = 1;
        for (int i = 0; i < money.length; i++) {
            for (int j = 1; j <= miane; j++) {
                if (j>=money[i]){
                    dp[j] = dp[j] + dp[j-money[i]];
                }
            }
        }
        System.out.println(dp[miane]);
    }
}
