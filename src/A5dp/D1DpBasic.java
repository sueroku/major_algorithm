package A5dp;

public class D1DpBasic {
    public static void main(String[] args) {
        //        1,4,5 숫자를 조합하여 13을 만들 수 있는 조합 중 가장 짧은 조합의 길이 : dp
        // dfs, bfs  는 너무 오래 걸려용
//        12, 9, 8 중에 가장 작은 조합을 가진 조합의 개수에 +1
//        min(f(n-1), f(n-2)...) +1
        int target =13;
        int[] number = {1,4,5};
        int[] minList = new int[target+1];
        minList[1] = 1;
        minList[2] = 2;
        minList[3] = 3;
        minList[4] = 1;
        minList[5] = 1;

        for(int i=6;i<target+1;i++){
            int min = Integer.MAX_VALUE;
            for(int n : number){
                if(min > minList[i-n]){
                    min = minList[i-n];
                }
            }
//            int min = minList[i-1];
//            if(min > minList[i-4]){
//                min = minList[i-4];
//            }else if(min > minList[i-5]){
//                min = minList[i-5];
//            }
            minList[i] = min +1;
        }

        System.out.println(minList[13]);


    }
}
