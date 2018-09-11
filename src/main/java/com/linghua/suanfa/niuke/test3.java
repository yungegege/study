package com.linghua.suanfa.niuke;

public class test3 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0, total=0;
        int j=-1;
        for(int i=0; i<gas.length; i++){
            sum += gas[i]-cost[i];//单个节点剩余的汽油，判断是否是有效节点
            total += gas[i]-cost[i];//总共剩余的汽油
            if(sum < 0)
            {
                j=i;
                sum=0;
            }
        }

        return total >=0 ? j+1:-1;
    }
}
