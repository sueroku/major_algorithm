package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D7여행경로 {

    static boolean[] visited;
    static List<List<String>> trip;
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] answer = {};

        trip = new ArrayList<>();
        visited = new boolean[]{};



    }
    static void dfs(){

    }
}

// 지호님 코드
//package A3bfs;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class B6Solution {
//    static List<String[]> paths; //  가능한 경로들의 집합
//    static LinkedList<String> path; // 가능한 경로 = temp
//    static boolean[] used; // 티켓이 사용됨
//
//    public static void main(String[] args) {
////        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
//        String[][] tickets2 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//        String[] answer = solution(tickets2);
//        System.out.println(Arrays.toString(answer));
//    }
//
//    static int pathCmp(String[] a, String[] b) {
//        for (int i = 0; i < a.length; i++) {
//            if (!a[i].equals(b[i])) {
//                return a[i].compareTo(b[i]);
//            }
//        }
//        return 0;
//    }
//
//    static String[] minPath() {
//        String[] answer = paths.get(0);
//        for (int i = 1; i < paths.size(); i++) {
//            if (pathCmp(answer, paths.get(i)) > 0) {
//                answer = paths.get(i);
//            }
//        }
//        return answer;
//    }
//
//    static void dfs(String[][] tickets) {
//        if (path.size() == tickets.length + 1) {
//            paths.add(path.toArray(new String[0]));
//        } else {
//            for (int i = 0; i < tickets.length; i++) {
//                if (!used[i] && path.getLast().equals(tickets[i][0])) {
//                    path.add(tickets[i][1]);
//                    used[i] = true;
//                    dfs(tickets);
//                    used[i] = false;
//                    path.removeLast();
//                }
//            }
//        }
//    }
//
//    public static String[] solution(String[][] tickets) {
//
//        paths = new ArrayList<>();
//        path = new LinkedList<>();
//        used = new boolean[tickets.length];
//
//        path.add("ICN");
//        dfs(tickets);
//        return minPath();
//    }
//}



// 예나님 코드
//public class Solution {
//    public static void main(String[] args) {
//        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"},{"ATL","SFO"}};
//        System.out.println(Arrays.toString(solution(tickets)));
//    }
//
//    public static String[] solution(String[][] tickets) {
//        Map<String, PriorityQueue<String>> plane = new HashMap<>();
//        List<String> result = new ArrayList<>();
//        Stack<String> s = new Stack<>();
//
//        for (String[] t : tickets) {
//            plane.computeIfAbsent(t[0], a -> new PriorityQueue<>()).add(t[1]);
//        }
//
//        s.push("ICN");
//        while (!s.isEmpty()) {
//            String top = s.peek();
//            if (plane.containsKey(top) && !plane.get(top).isEmpty()) {
//                s.push(plane.get(top).poll());
//            } else {
//                result.add(0, s.pop());
//            }
//        }
//        return result.toArray(new String[0]);
//    }
//}
//
//plane.forEach((key, value) -> System.out.println("출발지 :  " + key + "\t 도착지 : " + value));
//출발지 :  ICN     도착지 : [ATL, SFO]
//출발지 :  ATL     도착지 : [ICN, SFO]
//출발지 :  SFO     도착지 : [ATL]
//
//찍어보면 이해하기 쉬울 겁니다....ㅎ..
