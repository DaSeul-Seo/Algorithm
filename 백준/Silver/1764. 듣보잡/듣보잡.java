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
        HearSee();
    }

    public static void HearSee() {
        /*
            첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
            이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, 
            N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
            이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
            듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
            듣보잡의 수와 그 명단을 사전순으로 출력한다.

            <예시>
            3 4
            ohhenrie
            charlie
            baesangwook
            obama
            baesangwook
            ohhenrie
            clinton
            ---
            2
            baesangwook
            ohhenrie
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();
            
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<String> hearSet = new HashSet<>();
            List<String> result = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                hearSet.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                String name = br.readLine();
                if (hearSet.contains(name)) {
                    result.add(name);
                }
            }

            Collections.sort(result);

            sb.append(result.size() + "\n");

            for (String str : result) {
                sb.append(str + "\n");
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