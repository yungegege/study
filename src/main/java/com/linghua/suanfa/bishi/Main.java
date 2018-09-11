// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int time = in.nextInt();

        List<Integer> result = new ArrayList<>();

        Integer [][] arr = new Integer[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }

        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });

        int left = 0, right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid][1] > time){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        //left为第一个比time大的时间
        left--;
        while(left >= 0){
            if(arr[left][1] <= time && arr[left][2] >= time){
                result.add(arr[left][0]);
            }else if(arr[left][1] > time){
                break;
            }
            left--;
        }
        Collections.sort(result);
        if(result.size() == 0){
            System.out.println("null");
        }else{
            for(int x : result)
                System.out.println(x);
        }
    }
}
