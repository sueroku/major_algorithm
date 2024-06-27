package A6투포인터;

import java.util.ArrayList;
import java.util.List;

public class T3숫자의표현 {
    public static void main(String[] args) {
        int n = 15;

        int[] arr = new int[15+1];
        for(int i=1;i<=15;i++){
            arr[i] = i;
        }

        int result = 0;

        int start=1,end=1;
        int sum = arr[1];
        while(start<=end){
            if(sum == n){
                result++;
                sum-=arr[start];
                start++;
            } else if (sum<n && end < arr.length-1) {
                end++;
                sum+=arr[end];
            }else {
                sum-=arr[start];
                start++;
            }
        }

        System.out.println(result);
    }
}
