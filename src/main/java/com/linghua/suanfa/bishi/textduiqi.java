import java.io.*;
import java.util.*;

public class textduiqi {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        String a;
        int b;
//        while (true) {
        a = cin.nextLine();
        b = cin.nextInt();
        String[] arr = a.split(",");
        List<String> list = fullJustify(arr,b);
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.println(list.get(i));

            }
        }
//        }
    }


    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < words.length) {
            j = i;
            int currWidth = words[i].length();
            while (j+1 < words.length && (currWidth + words[j+1].length() +j+1-i) <= maxWidth) {
                j++;
                currWidth += words[j].length();
            }
            int spaces = 0, remain = 0;
            if (j > i) {// abc---de---fg--h (16-8) / 3 = 2, remain = 8 - 3*2
                spaces = (maxWidth - currWidth) / (j - i);
                remain = (maxWidth - currWidth) - spaces * (j - i);
            }
            StringBuilder sb = new StringBuilder();
            for (int k = i; k <= j; k++) {
                sb.append(words[k]);
                //last line
                if (j == words.length - 1 && sb.length() < maxWidth) {
                    sb.append(" ");
                } else if (k != j) { //not last line
                    for (int l = 0; l < spaces; l++)sb.append(" ");
                    if (remain-- > 0)sb.append(" ");
                }
            }
            int l = sb.length();// easy to change
            for (int k = 0; k < maxWidth-l; k++) {
                sb.append(" ");
            }
            list.add(sb.toString());
            i = j+1;
        }
        String last = list.get(list.size()-1);
        return list;
    }
}