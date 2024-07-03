package A8코딩페스티벌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon6443 {
    static Set<String> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        List<Character>[] pieces = new ArrayList[n];

        for(int i=0;i<n;i++){
            String st = br.readLine();
            pieces[i] = new ArrayList<>();
            for(char c : st.toCharArray()){
                pieces[i].add(c);
            }
        }

        for(List<Character> ch : pieces){
            Collections.sort(ch);
            result = new HashSet<>();
            dfs(ch, "", new boolean[ch.size()],result);
            for(String st : result){
                System.out.println(st);
            }
        }

    }

    static void dfs(List<Character> piece, String temp, boolean[] visited,Set<String> result) {
        if(piece.size() == temp.length()){
            result.add(temp);
            return;
        }
        for(int i=0;i<piece.size(); i++){
            if(!visited[i]){
                temp+=piece.get(i);
                visited[i] = true;
                dfs(piece, temp, visited, result);
                temp = temp.substring(0, temp.length()-1);
                visited[i] = false;
            }
        }
    }
}



// 지호님
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Baekjoon6443 {
//    static char[] buffer;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            char[] s = scanner.nextLine().toCharArray();
//            boolean[] used = new boolean[s.length];
//            buffer = new char[s.length];
//            Arrays.sort(s);
//            dfs(s, used, 0);
//        }
//    }
//
//    static void dfs(char[] s, boolean[] used, int len) {
//        if (len == s.length) {
//            System.out.println(buffer);
//        }
//        else {
//            boolean[] used2 = new boolean[s.length];
//            for (int i = 0; i < s.length; i++) {
//                if (!used[i] && !used2[i]) {
//                    buffer[len] = s[i];
//                    used[i] = true;
//                    dfs(s, used.clone(), len + 1);
//                    used[i] = false;
//                    for (int j = 0; j < s.length; j++) {
//                        if (s[j] == s[i] && !used[j]) {
//                            used2[j] = true;
//                        }
//                    }
//                }
//            }
//        }
//    }
//}




// 정답이라고 하네용
//public class 에너그램 {
//    static boolean[] visit;
//    static Queue<String> pq;
//    static char[] st;
//    static char[] res;
//    static int limit;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        while (tc-- > 0) {
//            st = br.readLine().toCharArray();
//            Arrays.sort(st); // 입력 문자를 정렬
//            res = new char[st.length];
//            visit = new boolean[st.length];
//            limit = st.length;
//            pq = new PriorityQueue<>();
//
//            dfs(0);
//
//            StringBuilder sb = new StringBuilder();
//            String prev = "";
//            while (!pq.isEmpty()) {
//                String current = pq.poll();
//                if (!current.equals(prev)) { // 중복된 결과 제거
//                    sb.append(current).append("\n");
//                    prev = current;
//                }
//            }
//            System.out.print(sb);
//        }
//        br.close();
//    }
//
//    public static void dfs(int depth) {
//        if (depth == limit) {
//            pq.add(new String(res));
//            return;
//        }
//        for (int i = 0; i < st.length; i++) {
//            if (!visit[i]) {
//                // 같은 문자가 연속으로 나오는 것을 방지
//                if (i > 0 && st[i] == st[i - 1] && !visit[i - 1]) continue;
//                visit[i] = true;
//                res[depth] = st[i];
//                dfs(depth + 1);
//                visit[i] = false;
//            }
//        }
//    }
//}
