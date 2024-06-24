//package A1sort;
//
//public class S1HeapSort구현 {
//    public static void main(String[] args) {
//        int[] arr= {7,6,5,8,3,5,9,1,6};
////        최초힙 구성
//
////        루트노드와 최하위노드를 change하면서 heapify
//
//    }
//
//    static void heapify(int start) {
////      left = start*2 +1
////        right = start*2 +2
//
////        check1 : 왼쪽,오른쪽 노드가 배열의 길이보다 짧아야함
//
////        check2 : stat를 제외한 left, right 세개 중 가장 작은 노드로 다시 heapify
//
////        if(체인지가 일어나면){heapify(left or right)}
//    }
//
//}






package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1HeapSort구현 {
    public static void main(String[] args) {
        int[] arr= {7,6,5,8,3,5,9,1,6};
//        최초힙 구성
        for (int i=arr.length/2-1;i>=0;i--){
            heapify(arr, arr.length-1, i);
        }
//        루트노드와 최하위노드를 change하면서 heapify
        for(int i= arr.length-1; i>=0 ; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,i-1, 0);
        }

        int[] arr2 = {7,6,5,8,3,5,9,1,6};
        Queue<Integer> pq = new PriorityQueue<>(); // 힙을 가지고 유지하는 녀석임.
        for(int a : arr2){
            pq.add(a); // add 상향식 heapify 수행 (logn?nlongn) // poll 은 하향식(트리에서 파고파고 내려가는거) heapify(logn)
        }
        System.out.println(pq); // 이미 최초힙구조로 완성됨
        System.out.println(Arrays.toString(arr));

    }

    static void heapify(int[] arr,int arrLength, int node) { //node==start
//      left = start*2 +1
//        right = start*2 +2
//        check1 : 왼쪽,오른쪽 노드가 배열의 길이보다 짧아야함
//        check2 : stat를 제외한 left, right 세개 중 가장 작은 노드로 다시 heapify

        int left = node*2 +1;
        int right = node*2 +2;
        if(left>arrLength) return;
        if(right>arrLength){
//            node와 left 만 비교
            if(arr[node]>arr[left]){
                int temp = arr[node];
                arr[node] = arr[left];
                arr[left] = temp;
                heapify(arr, arrLength, left);
            }
        }else {
//            node, left right 모두 비교
            int index = 0;
            if(arr[node]>arr[left] || arr[node]>arr[right]){
                if(arr[left]>arr[right]){
                    index = right;
                }else{
                    index = left;
                }
                int temp = arr[node];
                arr[node] = arr[index];
                arr[index] = temp;
                heapify(arr, arrLength, index);
            }
        }


    }


}

//// 프로그래머스 - 명예의 전당
//class Solution { // 내코드
//    public int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//        Queue<Integer> scoreList = new PriorityQueue<>();
//        for(int i=0;i<score.length;i++){
//            if(i<k){
//                scoreList.add(score[i]);
//                answer[i] = scoreList.poll();
//                scoreList.add(answer[i]);
//            }else{
//                int a = scoreList.poll();
//                if(score[i]>a){
//                    scoreList.add(score[i]);
//                    answer[i] = scoreList.poll();
//                    scoreList.add(answer[i]);
//                }
//                else{
//                    scoreList.add(a);
//                    answer[i] = scoreList.poll();
//                    scoreList.add(answer[i]);
//                }
//            }
//        }
//
//        return answer;
//    }
//}
