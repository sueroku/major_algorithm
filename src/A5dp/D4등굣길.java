package A5dp;

import java.util.Arrays;

public class D4등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2,2}};

        int[][] loadHome = new int[n][m]; // 0로 초기화
        loadHome[0][0] = 1; // 집

        for(int i=0; i<puddles.length; i++){
            loadHome[puddles[i][1]-1][puddles[i][0]-1] = -1; // 물웅덩이
        }

        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                if(loadHome[i][j] == -1 || (i==0&&j==0)){ // 물웅덩이 안가, 집에 안가
                    continue;
                }else if(i==0){ // 첫 오른쪽 길은 한길밖에 없어
                    loadHome[i][j] = loadHome[i][j-1];
                }else if(j==0){ // 첫 아래쪽 길도 한길밖에 없어
                    loadHome[i][j] = loadHome[i-1][j];
                }else if(loadHome[i][j-1] == -1 && loadHome[i-1][j] ==-1) { // 물웅덩이가 위에도 있고 왼쪽에도 있으면
                    loadHome[i][j] = 0;
                }else if (loadHome[i-1][j] ==-1) { // 물웅덩이가 위에 있으면
                    loadHome[i][j] = loadHome[i][j-1];
                }else if(loadHome[i][j-1] == -1){// 물웅덩이가 왼쪽에 있으면
                    loadHome[i][j] = loadHome[i-1][j];
                }else{ // 드디어 깨끗한 길
                    loadHome[i][j] = loadHome[i-1][j] + loadHome[i][j-1];
                }
            }
        }

        System.out.println(Arrays.deepToString(loadHome));
        System.out.println(loadHome[n-1][m-1]);


    }
}


//static class Solution {
//    public int solution(int m, int n, int[][] puddles) {
//        int[][] dp = new int[n][m];
//        for (int[] row : dp) {
//            Arrays.fill(row, -1);
//        }
//        for (int[] puddle : puddles) {
//            dp[puddle[1] - 1][puddle[0] - 1] = 0;
//        }
//        return findPaths(m - 1, n - 1, dp);
//    }
//
//    private int findPaths(int m, int n, int[][] dp) {
//        if (dp[n][m] != -1) {
//            return dp[n][m];
//        }
//        if (m == 0 && n == 0) {
//            return 1;
//        }
//        dp[n][m] = (findPaths(m - 1, n, dp) + findPaths(m, n - 1, dp)) % 1000000007;
//        return dp[n][m];
//    }
//}
