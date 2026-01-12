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
        Statistics();

    }

    public static void Statistics() {
        /*
            산술평균 : N개의 수들의 합을 N으로 나눈 값
            중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
            최빈값 : N개의 수들 중 가장 많이 나타나는 값
            범위 : N개의 수들 중 최댓값과 최솟값의 차이
            N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
            첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 
            그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

            첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
            둘째 줄에는 중앙값을 출력한다.
            셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
            넷째 줄에는 범위를 출력한다.

            <예시>
            5
            1
            3
            8
            -2
            2
            ---
            2
            2
            1
            10
            <예시2>
            1
            4000
            ---
            4000
            4000
            4000
            0
            <예시3>
            5
            -1
            -2
            -3
            -1
            -2
            ---
            -2
            -2
            -1
            2
            <예시4>
            3
            0
            0
            -1
            ---
            0
            0
            0
            1
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            // 산술평균 : N개의 수들의 합을 N으로 나눈 값
            int sum = 0;
            for (Integer num : list) {
                sum += num;
            }
            sb.append((int)Math.round((double)sum/N) + "\n");
            
            // 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
            Collections.sort(list);
            int mid = (int)Math.ceil(N / 2);
            sb.append(list.get(mid)  + "\n");
            
            // 최빈값 : N개의 수들 중 가장 많이 나타나는 값
            Map<Integer, Integer> map = new HashMap<>();

            for (Integer num : list) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort((a, b) -> map.get(b.getKey()) - map.get(a.getKey()));

            int maxNum = entryList.get(0).getValue();

            List<Integer> freqList = new ArrayList<>();
            
            for (Map.Entry<Integer, Integer> entry : entryList) {
                if (entry.getValue() == maxNum) {
                    freqList.add(entry.getKey());
                }
                else {
                    break;
                }
            }

            Collections.sort(freqList);

            if (freqList.size() >= 2) {
                sb.append(freqList.get(1) + "\n");
            }
            else {
                sb.append(freqList.get(0) + "\n");
            }
            
            // 범위 : N개의 수들 중 최댓값과 최솟값의 차이
            sb.append(list.get(list.size() - 1) - list.get(0));

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception ex) {
            System.out.println(ex);
        }

    }
}