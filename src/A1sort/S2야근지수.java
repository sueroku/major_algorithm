package A1sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class S2야근지수 {
    public static void main(String[] args) {
        int n =4;
        int[] works = {4, 3, 3};
        long answer = 0L;

//        내 코드
//        Queue<Integer> arr = new PriorityQueue<>(Comparator.reverseOrder());
//        for(int a : works){
//            arr.add(a);
//        }
//        if(Arrays.stream(works).sum() < n){
//            answer = 0L;
//        }else{
//            for(int i=0; i<n;i++){
//                int temp = arr.poll() -1;
//                arr.add(temp);
//            }
//            for(int i=0;i<works.length;i++){
//                answer += (long) Math.pow(arr.poll(), 2);
//            }
//        }


    }
}
