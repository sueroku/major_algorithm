package A4greedy;

import java.util.*;

public class G3구명보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int answer = 0;

        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));
        int start = 0;
        int end = people.length - 1;

        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                answer++;
                start++;
                end--;
            } else {
                answer++;
                end--;
            }
        }

        while (start <= end) {
            answer++;
            end--;
            if (people[start] + people[end] <= limit) {
                start++;
            }
        }
    }

// 큰수 만들기
    static void solution(String number, int k){
        String answer="";
        char[] arr = new char[number.length()];
        
    }
}
