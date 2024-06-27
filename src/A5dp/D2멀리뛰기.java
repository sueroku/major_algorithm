package A5dp;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        int n = 4;

//        long[] dpList = new long[n+1];
//        dpList[1] = 1;
//        dpList[2] = 2;
//        for(int i=3;i<=n;i++){
//            dpList[i]=dpList[i-1]+dpList[i-2];
//        }

        long[] dpList = new long[n+1];
        dpList[1] = 1;
        dpList[2] = 2;
        for(int i=3;i<=n;i++){
            dpList[i]=dpList[i-1]+dpList[i-2];
        }
        long answer = (long)(dpList[n] % 1234567); // 나머지 연산의 룰을 찾아보시게
        System.out.println(answer);

    }
//    static int dp(int n){
//        if(n==1) return 1;
//        else if (n==2) return 2;
//        else return dp(n-1) + dp(n-2);
//    }
}
