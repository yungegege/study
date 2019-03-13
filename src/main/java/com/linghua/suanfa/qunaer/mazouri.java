package com.linghua.suanfa.qunaer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//public class mazouri {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String line = sc.nextLine();
//            int[][] arr = new int[8][8];
//            for (int i = 0; i < 8; i++) {
//                for (int j = 0; j < 8; j++) {
//                }
//            }
//            String[] jbjbjb = line.split(" ");
//            int[] site = new int[4];
//            for (int i = 0; i < jbjbjb.length; i++) {
//                site[i] = Integer.parseInt(jbjbjb[i]);
//            }
//
//        }
//    }
//}


class Node { //坐标类
    public int x;
    public int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class mazouri {
    public static boolean[][] visited;
    public static int[][] dp;
    public static Queue<Node> queue = new LinkedList<>();

    public static void BFS(int x1, int y1, int x2, int y2) {//广度优先搜索
        Node node = new Node(x1, y1);
        visited[x1][y1] = true;
        dp[x1][y1] = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            Node frontNode = queue.poll();
            if (frontNode.x - 1 > 0 && frontNode.y - 2 > 0 && visited[frontNode.x - 1][frontNode.y - 2] == false) {//左上1
                visited[frontNode.x - 1][frontNode.y - 2] = true;
                queue.add(new Node(frontNode.x - 1, frontNode.y - 2));
                dp[frontNode.x - 1][frontNode.y - 2] = Math.min(dp[frontNode.x - 1][frontNode.y - 2], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x + 1 < 9 && frontNode.y - 2 > 0 && visited[frontNode.x + 1][frontNode.y - 2] == false) {//右上1
                visited[frontNode.x + 1][frontNode.y - 2] = true;
                queue.add(new Node(frontNode.x + 1, frontNode.y - 2));
                dp[frontNode.x + 1][frontNode.y - 2] = Math.min(dp[frontNode.x + 1][frontNode.y - 2], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x + 2 < 9 && frontNode.y - 1 > 0 && visited[frontNode.x + 2][frontNode.y - 1] == false) {//右上2
                visited[frontNode.x + 2][frontNode.y - 1] = true;
                queue.add(new Node(frontNode.x + 2, frontNode.y - 1));
                dp[frontNode.x + 2][frontNode.y - 1] = Math.min(dp[frontNode.x + 2][frontNode.y - 1], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x - 2 > 0 && frontNode.y - 1 > 0 && visited[frontNode.x - 2][frontNode.y - 1] == false) {//左上2
                visited[frontNode.x - 2][frontNode.y - 1] = true;
                queue.add(new Node(frontNode.x - 2, frontNode.y - 1));
                dp[frontNode.x - 2][frontNode.y - 1] = Math.min(dp[frontNode.x - 2][frontNode.y - 1], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x - 2 > 0 && frontNode.y + 1 < 9 && visited[frontNode.x - 2][frontNode.y + 1] == false) {//左下1
                visited[frontNode.x - 2][frontNode.y + 1] = true;
                queue.add(new Node(frontNode.x - 2, frontNode.y + 1));
                dp[frontNode.x - 2][frontNode.y + 1] = Math.min(dp[frontNode.x - 2][frontNode.y + 1], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x - 1 > 0 && frontNode.y + 2 < 9 && visited[frontNode.x - 1][frontNode.y + 2] == false) {//左下2
                visited[frontNode.x - 1][frontNode.y + 2] = true;
                queue.add(new Node(frontNode.x - 1, frontNode.y + 2));
                dp[frontNode.x - 1][frontNode.y + 2] = Math.min(dp[frontNode.x - 1][frontNode.y + 2], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x + 2 < 9 && frontNode.y + 1 < 9 && visited[frontNode.x + 2][frontNode.y + 1] == false) {//右下1
                visited[frontNode.x + 2][frontNode.y + 1] = true;
                queue.add(new Node(frontNode.x + 2, frontNode.y + 1));
                dp[frontNode.x + 2][frontNode.y + 1] = Math.min(dp[frontNode.x + 2][frontNode.y + 1], dp[frontNode.x][frontNode.y] + 1);
            }
            if (frontNode.x + 1 < 9 && frontNode.y + 2 < 9 && visited[frontNode.x + 1][frontNode.y + 2] == false) {//右下2
                visited[frontNode.x + 1][frontNode.y + 2] = true;
                queue.add(new Node(frontNode.x + 1, frontNode.y + 2));
                dp[frontNode.x + 1][frontNode.y + 2] = Math.min(dp[frontNode.x + 1][frontNode.y + 2], dp[frontNode.x][frontNode.y] + 1);
            }
        }
        if (dp[x2][y2] == 65535) {
            System.out.println(0);
        } else {
            System.out.println(dp[x2][y2]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
            return;
        }
        visited = new boolean[9][9];
        dp = new int[9][9];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                visited[i][j] = false;
                dp[i][j] = 65535;
            }
        }
        BFS(x1, y1, x2, y2);
    }
}
