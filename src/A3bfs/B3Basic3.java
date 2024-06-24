package A3bfs;

import java.util.*;

public class B3Basic3 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        adjList = new ArrayList<>();
        visited = new boolean[arr.length];
        distance = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        int start = 0;
        int end = 3;
        int minDistance = bfs(start, end);
        System.out.println(minDistance);

    }

    static int bfs(int start,int end){
        Queue<Integer> queue = new LinkedList<>();
//        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    queue.add(target);
                    distance[target] = distance[temp]+1;
                    visited[target] = true;
//                    if(target == end){
//                        return distance[target];
//                    }
                }
            }
        }
        return -1; // 없어용
    }
}


//package A3bfs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class B1basic3 {
//    static List<List<Integer>> adjList;
//    static boolean[] visited;
//    public static void main(String[] args) {
//        int[][] arr = {{0,1}, {0,2}, {1,3}, {2,3}, {2,4}};
//        adjList = new ArrayList<>();
//        visited = new boolean[5];
//        for(int i=0; i<5; i++){
//            adjList.add(new ArrayList<>());
//        }
//        for(int[] a : arr){
//            adjList.get(a[0]).add(a[1]);
//        }
////        bfs로 각 나오는 각 노드 방문하고 출력
//        int start = 0;
//        int end = 3;
//        int minDistance = bfs(start, end);
//        System.out.println(minDistance);
//    }
//    static int bfs(int start, int end){
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{start, 0});
//        visited[0] = true;
//        while (!queue.isEmpty()){
//            int[] temp = queue.poll();
//            visited[temp[0]] = true;
//            for(int target : adjList.get(temp[0])){
////                target을 queue에 add하기 전에 true로 세팅
//                if(visited[target]==false){
//                    queue.add(new int[]{target, temp[1]+1});
//                    visited[target] = true;
//                    if(target == end){
//                        return temp[1]+1;
//                    }
//                }
//            }
//        }
//        return -1;
//    }
//}
