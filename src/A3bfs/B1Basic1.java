package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1Basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] arr = {{0,1}, {0,2},{1,3},{2,3},{2,4}};
        adjList = new ArrayList<>();
        visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }

        //    bfs로 각 노드 방문 출력
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            System.out.println(temp);
            for(int target : adjList.get(temp)){
//                target을 queue 에 add 하기 전에 true로 세팅     ?? 전에??
                if(!visited[target]){
                    queue.add(target);
                    visited[target] = true;
                }
            }
        }
    }
}


//    static void bfs(int start){
//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(start);
//        visited[start] = true;
//
//        while (!queue.isEmpty()){
//            System.out.println(start);
//            for(int a : adjList.get(start)){
//                queue.add(a);
//                if(!visited[a]){
//                    visited[a] = true;
//                    bfs(a);
//                }
//            }
//        }
//
//    }
