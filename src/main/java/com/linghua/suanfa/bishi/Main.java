import java.io.*;
import java.util.*;

class Test {
}

public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        while (true) {
            String str = cin.nextLine();

            int max = 0;
            int index = 0;
            String maxs = "";
            for (int i = 0; i < str.length() - 1; i++) {
                char a = str.charAt(i);
                char b = 0;
                char c = 0;
                int anum = 1;
                int bnum = 0;
                int cnum = 0;
                for (int j = i + 1; j < str.length(); j++) {

                    if (a == str.charAt(j) && bnum == 0 && cnum == 0) {
                        anum++;
                    }
                    if (a != str.charAt(j) && bnum == 0 && cnum == 0) {
                        b = str.charAt(j);
                        bnum++;
                    } else if (a != str.charAt(j) && b == str.charAt(j) && cnum == 0) {
                        bnum++;
                    }
                    if (anum > 0 && bnum > 0 && b != str.charAt(j) && cnum == 0) {
                        c = str.charAt(j);
                        cnum++;
                    } else if (c == str.charAt(j)) {
                        cnum++;
                    }
                }
                if (anum > bnum && cnum > bnum) {
                    int num = anum > cnum ? cnum : anum;
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < num; j++) {
                        sb.append(a);
                    }
                    for (int j = 0; j < bnum; j++) {
                        sb.append(b);
                    }
                    for (int j = 0; j < num; j++) {
                        sb.append(c);
                    }
                    if (max < sb.length()) {
                        max = sb.length();
                        index = i;
                        maxs = sb.toString();
                    }
                }
            }
            System.out.println(maxs);
        }

    }
}