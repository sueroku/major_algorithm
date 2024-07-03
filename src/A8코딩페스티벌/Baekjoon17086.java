package A8코딩페스티벌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon17086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 세로
        int m = Integer.parseInt(br.readLine()); // 가로

        List<List<Integer>> shark = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<n;i++){
            st =  new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++) {
                shark.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }


    }
}





// 지호님 아이디어
// 상어가 있는 좌표만 따로 체크리스트를 만들고
// 각각의 칸과 상어가 있는 좌표들만와의 거리를 구한다.
// 이때 거리를 구하는 방법은
// 구하려는 칸의 x좌표와 상어가 있는 x좌표를 뺀 절대값과,
// 구하려는 칸의 y좌표와 상어가 있는 y좌표를 뺀 절대값과,
// 이 절대값 중에서 큰 값에 -1 를 하면 거리가 나온다. (근데 모든 값에 -1 해주는 것이기때문에 딱히 해줄 필요 없다.)
// 구하려는 칸과 각각의 상어들과의 거리 중 가장 적은 거리를 리스트에 넣어주고
// 그 거리들 중 최대값을 구하면 답이 나온다.

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[][] arr = new int[N][M];    // 입력받은 위치
//
//        List<int[]> sharkList = new ArrayList<>();
//        for(int i=0; i<N; i++){
//            st= new StringTokenizer(br.readLine());
//            for(int j=0; j<M; j++){
//                int num = Integer.parseInt(st.nextToken());
//                arr[i][j] = num;
//                if(num == 1){
//                    sharkList.add(new int[]{i, j});
//                }
//            }
//        }
//
//        List<Integer> safeList = new ArrayList<>();
//
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++) {
//                int min = Integer.MAX_VALUE;
//                if(arr[i][j] != 1){
//                    for(int[] shark : sharkList){
//                        int num = Math.max(Math.abs(i-shark[0]), Math.abs(j-shark[1]));
//                        if(min > num)
//                            min = num;
//                    }
//                    safeList.add(min);
//                }
//            }
//        }
//
//        Collections.sort(safeList);
//        System.out.println(safeList.get(safeList.size()-1));
//
//
//
//
//
//    }
//
//
//}



// 승현님
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.StringTokenizer;
//
//public class B아기상어2 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[][] arr = new int[N][M];    // 입력받은 상어의 위치
//
//        for(int i=0; i<N; i++){
//            st= new StringTokenizer(br.readLine());
//            for(int j=0; j<M; j++){
//                int num = Integer.parseInt(st.nextToken());
//                arr[i][j] = num;
//            }
//        }
//
//
//        int[][] safeLength = new int[N][M];
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                if(arr[i][j] != 1){ //현재 위치가 상어가 아닌 경우
//                    // 각 위치마다 bfs를 해야하기 때문에 queue와 visited를 초기화 해야함
//                    boolean[][] visited = new boolean[arr.length][arr[0].length];
//                    Deque<int[]> queue = new LinkedList();
//                    queue.add(new int[]{i, j, 0});
//                    visited[i][j] = true;
//
//                    safeLength[i][j] = bfs(arr, visited, queue);    // 상어를 만나면 bfs를 멈추고 안전거리 입력
//                }
//            }
//        }
//
//        //최댓값 구하기
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++) {
//                if(max < safeLength[i][j]){
//                    max = safeLength[i][j];
//                }
//            }
//        }
//
//        System.out.println(max);
//    }
//
//    public static int bfs(int[][] arr, boolean[][] visited, Deque<int[]>queue){
//        int[] di = {-1, -1, -1, 0, 0, 1, 1, 1}; //가야할 방향 배열
//        int[] dj = {-1, 0, 1, -1, 1, -1, 0, 1};
//        while(!queue.isEmpty()){
//            int[] now = queue.poll();
//            int i = now[0];
//            int j = now[1];
//            int sLength = now[2];   //안전거리
//            for(int m=0; m<8; m++){
//                int ni = i + di[m];
//                int nj = j + dj[m];
//                if(ni >=0 && ni <arr.length && nj >=0 && nj < arr[0].length){
//                    if(!visited[ni][nj]){   //갈 곳이 방문하지 않았고
//                        if(arr[ni][nj] == 1){   // 갈 곳에 상어가 있다면
//                            return sLength+1;
//                        }
//                        queue.add(new int[]{ni, nj, sLength+1});
//                        visited[ni][nj] = true;
//                    }
//                }
//
//            }
//        }
//        return 0;
//    }
//}