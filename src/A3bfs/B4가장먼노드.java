package A3bfs;

import java.util.*;

public class B4가장먼노드 {
    public static void main(String[] args) {
        int[][]edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;
        int answer = 0;

        List<List<Integer>> adjList = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        for(int i=0;i<n+1;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : edge){
         adjList.get(a[0]).add(a[1]);
         adjList.get(a[1]).add(a[0]);
        }

//        System.out.println(adjList);
        int[] distance = new int[n+1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] =true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    queue.add(target);
                    visited[target] = true;
                    distance[target] = distance[temp] +1;
                }
            }
        }

        int max = Arrays.stream(distance).max().getAsInt();

        for(int a : distance){
            if(a == max){
                answer++;
            }
        }

//        System.out.println(Arrays.toString(distance));
//        System.out.println(answer);
    }
}




//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{1,0});
//        visited[1] = true;
//        while (!queue.isEmpty()){
//            int[] temp = queue.poll();
//            for(int target : adjList.get(temp[0])){
//                if(!visited[target]){
//                    queue.add(new int[]{target, temp[1]+1});
//                    visited[target] = true;
//                }
//            }
//        }
