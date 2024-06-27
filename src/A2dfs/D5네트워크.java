package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D5네트워크 {
    static List<List<Integer>> network;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//        int[][] computers = {1, 1, 0}, {1, 1, 1}, {0, 1, 1};
        int n = 3;

        network = new ArrayList<>();
        for(int i=0;i<n;i++){
            network.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(computers[i][j] == 1 && i!=j){
                    network.get(i).add(j);
                }
            }
        } //  주객전도 같은뎅..?

        visited = new boolean[n];
        int answer = 0;
        for(int i=0; i<network.size();i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
    }

    static void dfs(int check){
        visited[check] = true;
        for(int a : network.get(check)){
            if(!visited[a]){
                visited[a] =true;
                dfs(a);
            }
        }
    }
}

// 은지님
//import java.util.*;
//
//class Solution {
//    static boolean[] visited;
//    static List<Integer>[] A;
//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        A = new List[computers.length];
//        visited = new boolean[computers.length];
//
//        for(int i=0;i<computers.length;i++){
//            A[i] = new ArrayList<>();
//        }
//        for(int i=0;i<computers.length;i++) {
//            for(int j=0;j<computers[i].length;j++) {
//                if(i==j) continue;
//                if(computers[i][j] == 1) {
//                    A[i].add(j);
//                }
//            }
//        }
//        for(int i=0;i<computers.length;i++) {
//            if(!visited[i]){
//                dfs(i);
//                answer++;
//            }
//        }
//        return answer;
//    }
//    void dfs(int start) {
//        visited[start] = true;
//        for(int i : A[start]) {
//            if(!visited[i]) {
//                visited[i] = true;
//                dfs(i);
//            }
//        }
//    }
//
//}

// 지호님
//public static int solution(int n, int[][] computers) {
//    boolean[] visited = new boolean[n];
//    int answer = 0;
//    for (int i = 0; i < n; i++) {
//        if (!visited[i]) {
//            visited[i] = true;
//            dfs(computers, visited, i);
//            answer++;
//        }
//    }
//    return answer;
//}
//
//static void dfs(int[][] computers, boolean[] visited, int start) {
//    for (int i = 0; i < computers[start].length; i++) {
//        if (start != i && computers[start][i] == 1 && !visited[i]) {
//            visited[i] = true;
//            dfs(computers, visited, i);
//        }
//    }
//}
