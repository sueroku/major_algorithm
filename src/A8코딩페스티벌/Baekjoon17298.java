package A8코딩페스티벌;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//import java.util.StringTokenizer;
//
//public class Baekjoon17298 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
////        Stack<Integer> arrOrigin = new Stack<>();
//        int[] arrOrigin = new int[n];
////        Stack<Integer> nge = new Stack<>();
//        int[] output = new int[n];  // 결과출력배열
//
//        for(int i=0;i<n;i++){
////            arrOrigin.push(Integer.parseInt(st.nextToken()));
//            arrOrigin[i] = Integer.parseInt(st.nextToken());
//            output[i] = -1; //출력 값 초기화
//        }
//
//        Stack<Integer> arrBig = new Stack<>();
//
//        for(int i=n-1;i>=0;i--){
//            if(arrBig.isEmpty()){
//                output[i] = -1;
////                nge.add(-1);
//                arrBig.push(arrOrigin[i]);
//            }else {
//                while (!arrBig.isEmpty()){
//                    if(arrOrigin[i]<arrBig.peek()){
////                        nge.add(arrBig.peek());
//                        output[i] = arrBig.peek();
//                        arrBig.push(arrOrigin[i]);
//                        break;
//                    } else{
//                        arrBig.pop();
//                    }
//                }
//                if(arrBig.isEmpty()){
////                    nge.add(-1);
//                    output[i] = -1;
//                    arrBig.push(arrOrigin[i]);
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<n; i++){
//            sb.append(output[i]+ " ");
//        }
//        sb.delete(sb.length()-1, sb.length());
//
//        System.out.println(sb);
//
//
//
//
//
////        while (!arrOrigin.isEmpty()){
////            if(arrBig.isEmpty()){
////                nge.push(-1);
////                arrBig.push(arrOrigin.pop());
////            }else {
////                if(arrBig.peek()>arrOrigin.peek()){
////                    nge.push(arrBig.peek());
////                    arrBig.push(arrOrigin.pop());
////                }else {
////                    while (!arrBig.isEmpty()){
////                        arrBig.pop();
////                        if(arrBig.peek()>arrOrigin.peek()){
////                            nge.push(arrBig.peek());
////                            arrBig.push(arrOrigin.pop());
////                            break;
////                        }
////                    }
////                    if(!arrOrigin.isEmpty()){
////                        arrBig.push(arrOrigin.pop());
////                    }
////                    nge.push(-1);
////                }
////            }
////        }
////        while (!nge.isEmpty()){
////            System.out.print(nge.pop() + " ");
////        }
//    }
//}


// 요한이네 조
//for (int i = 0; i < N; i++) {
//        arr[i] = Integer.parseInt(st.nextToken());
//        result[i] = -1;
//        }
//
//        for (int i = 0; i < N; i++) {
//        while (top >= 0 && arr[arr2[top]] < arr[i]) {
//        result[arr2[top--]] = arr[i];
//        }
//        arr2[++top] = i;
//        }




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrOrigin = new int[n]; // 주어지는 배열
        int[] output = new int[n];  // 결과출력배열

        for(int i=0;i<n;i++){
            arrOrigin[i] = Integer.parseInt(st.nextToken());
            output[i] = -1; //출력 값 초기화
        }

        Stack<Integer> arrBig = new Stack<>(); // 비교할 값 넣는 stack

        for(int i=n-1;i>=0;i--){
            if(arrBig.isEmpty()){
                output[i] = -1;
                arrBig.push(arrOrigin[i]);
            }else {
                while (!arrBig.isEmpty()){
                    if(arrOrigin[i]<arrBig.peek()){
                        output[i] = arrBig.peek();
                        arrBig.push(arrOrigin[i]);
                        break;
                    } else{
                        arrBig.pop();
                    }
                }
                if(arrBig.isEmpty()){
                    output[i] = -1;
                    arrBig.push(arrOrigin[i]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append(output[i]+ " ");
        }
        sb.delete(sb.length()-1, sb.length());

        System.out.println(sb);
    }
}
