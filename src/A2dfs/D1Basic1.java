package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D1Basic1 {
//    static List<Integer> adjList;
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
//        방문할 수 있는 정점이 여러개인 경우, 정점번호가 작은 것을 먼저 방문하는
//        dfs 알고리즘 형식의 방문순서를 출력하라 : 0, 1, 3, 2, 4
        int[][] arr = {{0,1}, {0,2},{1,3},{2,3},{2,4}};
//        int[][] arr2 = {{1,1,1,0,0},{0,1,0,1,0},{},}; // 위 그래프와 동일, 표현 방식 : 방문가능노드 1 방분불가능노드 0
        adjList = new ArrayList<>(); // 선언때 초기화해도 된다.
        visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
//            adjList.get(a[1]).add(a[0]); // 양방향일경우 추가
        }

        dfs(0);
    }


    static void dfs(int start){
//        Queue<Integer> pq = new PriorityQueue<>();
        System.out.println(start);
        visited[start] = true;
        for(int target : adjList.get(start)){
            if(visited[target]==false){
                dfs(target);
            }
        }
    }


}
