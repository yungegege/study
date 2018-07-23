package com.linghua.paixu;

public class ThreeSum {
    public static void main(String[] args){
        int[] arr = {1,2,-3};
        int count = count(arr);
        System.out.println(count);
    }

    public static int count(int[] nums) {
        int N = nums.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (nums[i] + nums[j] + nums[k] == 0)
                        cnt++;

        return cnt;
    }
}
