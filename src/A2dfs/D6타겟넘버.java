package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D6타겟넘버 {
    static boolean[] visited;
    static List<Integer> num;
    static int sum;
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int answer = 0;

        num = new ArrayList<>();
        for(int a :numbers){
            num.add(a);
        }


    }
}


// 뻘짓1
//package A2dfs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class D6타겟넘버 {
//    static boolean[] visited;
//    static List<Integer> num;
//    static int sum;
//    public static void main(String[] args) {
//        int[] numbers = {1, 1, 1, 1, 1};
//        int target = 3;
//        int answer = 0;
//
//        num = new ArrayList<>();
//        for(int a :numbers){
//            num.add(a);
//        }
//
////        for(int i=0;i<numbers.length;i++){
////            visited = new boolean[numbers.length];
////            sum = 0;
////            if(dfs(i, target, sum+numbers[i]) == target){
////                answer++;
////            }
////            if(dfs(i, target, sum-numbers[i]) == target){
////                answer++;
////            }
////
////        }
////        System.out.println(answer);
//
//    }
//
////    static int dfs(int check, int target, int sum){
////        visited[check] = true;
////
////
////
////        for(int a : num){
////            if(!visited[a]){
////                dfs(a, target, sum+a);
////                dfs(a, target,sum-a);
////            }
////        }
////    }
//}


// 예지
//package solve_java;
//
//
//public class 타겟넘버 {
//
//    static int cnt = 0;
//    public static void dfs(int[] numbers, int sum, int start, int target) {
//
//        if (start >= numbers.length) {
//            if (sum == target) cnt++;
//            return;
//        }
//        dfs(numbers, sum + numbers[start], start + 1, target);
//        dfs(numbers, sum - numbers[start], start + 1, target);
//    }
//
//    public static int solution(int[] numbers, int target) {
//
//        int sum = 0;
//        dfs(numbers, sum, 0, target);
//
//        return cnt;
//    }
//
//    public static void main(String[] args) {
//
//        int[] numbers = {1, 1, 1, 1, 1};
//        int target = 3;
//        /*int[] numbers = {4, 1, 2, 1};
//        int target = 4;*/
//        System.out.println(solution(numbers, target));
//    }
//}
