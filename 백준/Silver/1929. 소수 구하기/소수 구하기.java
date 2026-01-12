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

// Comparator => 음수 : a가 b보다 앞, 0 : 순서유지, 양수, b가 a보다 앞
public class Main {
    public static void main(String[] args) throws Exception {
        DecimalNum();

    }

    public static void DecimalNum() {
        /*
            M이상 N이하의 소수를 모두 출력
            첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
            (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
            한 줄에 하나씩, 증가하는 순서대로 소수를 출력

            <예시>
            3 16
            ---
            3
            5
            7
            11
            13
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            st = new StringTokenizer(br.readLine());
            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());
            
            boolean[] rstList = new boolean[endNum + 1];

            rstList[0] = rstList[1] = true;
            
            for (int i = 2; i <= Math.sqrt(rstList.length); i++) {
                if (rstList[i]) continue;

                for (int j = i * i; j < rstList.length; j = j + i)  {
                    rstList[j] = true;
                }
            }
            
            for (int i = startNum; i <= endNum; i++) {
                if (!rstList[i]) {
                    sb.append(i + "\n");
                }
            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception ex) {

        }
        
    }
}