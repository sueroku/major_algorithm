package A4greedy;

import java.util.*;

public class G2체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        int answer = n-lost.length;
        Set<Integer> reList = new HashSet<>();






//        List<Integer> reList = new ArrayList<>();
//        Queue<Integer> reList = new PriorityQueue<>(Comparator.reverseOrder());
//        for(int a : reserve){
//            reList.add(a);
//        }
//        for(int a : lost){
//            if(reList.contains(a)){
//                reList.remove(reList.indexOf(a));
//                answer++;
//            };
//        }
//        for(int i=0;i<lost.length;i++){
//            if(reList.contains(lost[i]-1)){
//                reList.remove(reList.indexOf(lost[i]-1));
//                answer++;
//            }else if(reList.contains(lost[i]+1)){
//                reList.remove(reList.indexOf(lost[i]+1));
//                answer++;
//            }
//        }

    }
}
