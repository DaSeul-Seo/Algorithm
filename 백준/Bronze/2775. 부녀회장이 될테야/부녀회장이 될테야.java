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
        Apartment();
    }

    public static void Apartment() {
        /*
            평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
            이 아파트에 거주를 하려면 조건이 있는데, 
            “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 
            사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
            아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 
            주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
            단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

            첫 번째 줄에 Test case의 수 T가 주어진다. 
            그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다.
            각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.

            <예시>
            2
            1
            3
            2
            3
            ---
            6
            10
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int T = Integer.parseInt(br.readLine());

            // 1층 3호에 몇명이 사는가 0층 1~3호 수 더하기
            // 2층 3호에 몇명이 사는가 1층 1~3호 수 더하기 -> 1층은 0층 1~3호 더하기
            // 0층은 1, 2, 3 ...
            for (int i = 0; i < T; i++) {
                int floor = Integer.parseInt(br.readLine());
                int ho = Integer.parseInt(br.readLine());

                int[][] apart = new int[floor + 1][ho];
                for (int f = 0; f <= floor; f++) {
                    for (int h = 0; h < ho; h++) {
                        if (f == 0) {
                            apart[f][h] = h + 1;
                            continue;
                        }

                        int pNum = 0;
                        for (int hh = 0; hh <= h; hh++) {
                            pNum += apart[f-1][hh];
                        }
                        apart[f][h] = pNum;
                    }
                }
                sb.append(apart[floor][ho-1] + " ");
            }

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