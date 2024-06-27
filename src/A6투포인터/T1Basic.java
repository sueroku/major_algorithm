package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1Basic {
    public static void main(String[] args) {
////        아래 배열에서 target 이 될 수 있는 두 수의 조합의 값을 모두 찾아라
//        int[] nums = {7,8,9,2,4,5,1,3,6};
//        int target = 10;
//
////        2중 for문 구현 : n^2
//        List<int[]> list = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    list.add(new int[]{nums[i],nums[j]});
//                }
//            }
//        }
//        for(int[] arr : list){
//            System.out.println(Arrays.toString(arr));
//        }
//
//
//        Arrays.sort(nums);
//        int start = 0;
//        int end = nums.length-1;
//
//        while (start<end){
//            if(nums[start] + nums[end]>target){
//                end--;
//            } else if (nums[start] + nums[end]<target) {
//                start++;
//            }else {
//                list.add(new int[]{nums[start], nums[end]});
//                start++;
//            }
//        }
//
//        for(int[] arr : list){
//            System.out.println(Arrays.toString(arr));
//        }


        int[] nums = {7,8,9,2,4,5,1,3,6}; // 0이상의 숫자들
        int target = 10;

        // 구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
        List<int[]> list = new ArrayList<>();

        int start =0, end =1;
        Arrays.sort(nums);
        int sum;
        while(end == list.size()){
            sum = 0;
            for(int i = start;i<end;i++){
                sum+= nums[i];
            }
            if(sum == target){
                list.add(new int[]{start, end});
                end++;
            }else if(sum<target){
                end++;
            }else if(sum>target){

            }
        }


    }
}
