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
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        SolvedAc();

    }

    public static void SolvedAc() {
        /*
            절사평균이란 극단적인 값들이 평균을 왜곡하는 것을 막기 위해 
            가장 큰 값들과 가장 작은 값들을 제외하고 평균을 내는 것을 말한다. 3
            0% 절사평균의 경우 위에서 15%, 아래에서 15%를 각각 제외하고 평균을 계산한다. 
            따라서 20명이 투표했다면, 가장 높은 난이도에 투표한 3명과 
            가장 낮은 난이도에 투표한 3명의 투표는 평균 계산에 반영하지 않는다는 것이다.

            첫 번째 줄에 난이도 의견의 개수 n이 주어진다. (0 ≤ n ≤ 3 × 105)
            이후 두 번째 줄부터 1 + n번째 줄까지 사용자들이 제출한 난이도 의견 n개가 한 줄에 하나씩 주어진다. 
            모든 난이도 의견은 1 이상 30 이하이다.

            <예시>
            5
            1
            5
            5
            7
            8
            ---
            6
            5명의 15%는 0.75명으로, 이를 반올림하면 1명이다. 
            따라서 solved.ac는 가장 높은 난이도 의견과 가장 낮은 난이도 의견을 하나씩 제외하고, 
            {5, 5, 7}에 대한 평균으로 문제 난이도를 결정한다.
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            
            if (N == 0) {
                bw.write("0");
                bw.flush();
                return;
            }
            
            List<Integer> list = new ArrayList<>();

            int removeCnt = (int)Math.round(N * 0.15);

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);
            int sumNum = 0;
            for (int i = removeCnt; i < list.size() - removeCnt; i++) {
                sumNum += list.get(i);
            }

            int listCnt = list.size() - removeCnt * 2;
            
            int result = (int)Math.round((sumNum / (double)listCnt));
            sb.append(result);

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception ex) {

        }
    }
}