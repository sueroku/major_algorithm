package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵 {
    static int[] dx={0,0,1,-1}; // 동서남북
    static int[] dy={1,-1,0,0};
    static boolean[][] visited;

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = 0;

        int n = maps.length; // 나는 0,0 에서 시작한다.
        int m = maps[0].length; // 적은 n-1, m-1에 있다.
        visited=new boolean[n][m]; // 미방문 노드 false 방문노드 true


        Queue<int[]> queue = new LinkedList<>();
        visited[0][0] = true;
        queue.add(new int[]{0,0,1});



    }
    static void bfs(int x, int y){




    }
}
