import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        FindNumber();
    }
    
    public static void FindNumber() {
        /*
            N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
            첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
            다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
            다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
            다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
            모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

            M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

            <예시>
            5
            4 1 5 2 3
            5
            1 3 7 9 5
            ---
            1
            1
            0
            0
            1
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N ; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int target = Integer.parseInt(st.nextToken());
                sb.append(set.contains(target) ? 1 : 0).append("\n");
            }

            // List<Integer> originList = new ArrayList<>();
            // st = new StringTokenizer(br.readLine());

            // for (int i = 0; i < N; i++) {
            //     originList.add(Integer.parseInt(st.nextToken()));
            // }

            // int M = Integer.parseInt(br.readLine());
            // List<Integer> targetList = new ArrayList<>();
            // st = new StringTokenizer(br.readLine());

            // for (int i = 0; i < M; i++) {
            //     targetList.add(Integer.parseInt(st.nextToken()));
            // }

            // for (Integer target : targetList) {
            //     boolean flag = false;
            //     for (Integer origin : originList) {
            //         if (target == origin) {
            //             sb.append(1 + "\n");
            //             flag = true;
            //         }
            //     }
            //     if (!flag) {
            //         sb.append(0 + "\n");
            //     }
            // }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception ex) {

        }
    }
}