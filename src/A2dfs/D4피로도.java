package A2dfs;

import java.util.*;

public class D4피로도 {
    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int k = 80;

        List<List<Integer>> dList = new ArrayList<>();
        int i = 0;
        for (int[] arr : dungeons) {
            dList.add(new ArrayList<>());
            dList.get(i).add(arr[0]);
            dList.get(i).add(arr[1]);
            i++;
        }

        List<Integer> count = new ArrayList<>();
        dungeon(new ArrayList<>(), dList,k, new boolean[dList.size()], count);

        Optional<Integer> answer = Optional.of(-1);
        if(!count.isEmpty()){
         answer = count.stream().max(Integer::compareTo);
        }
        System.out.println(answer.get());
    }

        static void dungeon(List<List<Integer>> temp, List<List<Integer>> dList, int k,  boolean[] visited, List<Integer> count){
        if(temp.size() == dList.size()){
//            System.out.println(temp);
            int i = k; // 피로도
            int j = 0; // 가는 던전 수
            for(List<Integer> a : temp){
                if(i>=a.get(0)){
                    i = i-a.get(1);
                    if(i>0) j++;
                }else {
                    break;
                }
            }
            count.add(j);
            return;
        }
        for(int i=0; i<dList.size(); i++){
            if(!visited[i]) {
                visited[i] = true;
                temp.add(dList.get(i));
                dungeon(temp, dList,k, visited,count);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }

    }

}

//    static void dungeon(List<List<Integer>> caseList, List<Integer> temp, List<List<Integer>> dList, int size, boolean[] visited, List<Integer> count){
//        if(temp.size() == size){
//            caseList.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0; i<dList.size(); i++){
//            if(!visited[i]) {
//                visited[i] = true;
//                temp.add(dList.get(i).get(1));
//                dungeon(caseList, temp, dList, size,visited,count);
//                temp.remove(temp.size()-1);
//                visited[i] = false;
//            }
//        }
//
//    }


// 혼자 시도 == 뻘짓이었음
//        Queue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]); // 왼쪽-오른쪽 오름차순 // 오른쪽 - 왼쪽 내림차순
//
//        for(int[] a : dungeons){
//            pq.add(a);
//        }
//        while (!pq.isEmpty()){
//            int[] temp = pq.poll();
//            System.out.println(Arrays.toString(temp));
//        }
//        int answer = 0;
//        while (k>0){
//            if(!pq.isEmpty()){
//                int[] temp = pq.poll();
//                if(k>=temp[0]){
//                    k = k-temp[1];
//                    answer++;
//                    if(k>=temp[0]){
//                        pq.add(temp);
//                    }
//                }
//            }else{
//                break;
//            }
//        }
//        System.out.println(answer);


//    List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//    List<List<Integer>> answer_p = new ArrayList<>();
//    permu(answer_p, new ArrayList<>(), myList, 2, new boolean[myList.size()]);
//        System.out.println(answer_p);
//    static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited){
//        if(temp.size() == count){
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0; i<myList.size(); i++){
//            if(!visited[i]) {
//                visited[i] = true;
//                temp.add(myList.get(i));
//                permu(answer, temp, myList, count,visited);
//                temp.remove(temp.size()-1);
//                visited[i] = false;
//            }
//        }// 한번 지나간 값은 표시해주는 boolean 배열...
//    }