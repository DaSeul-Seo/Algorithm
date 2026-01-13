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
        CompositionSum();
    }

    public static void CompositionSum() {
        /*
            비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
            add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
            remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
            check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
            toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
            all: S를 {1, 2, ..., 20} 으로 바꾼다.
            empty: S를 공집합으로 바꾼다.

            첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
            둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
            check 연산이 주어질때마다, 결과를 출력한다.

            <예시>
            26
            add 1
            add 2
            check 1
            check 2
            check 3
            remove 2
            check 1
            check 2
            toggle 3
            check 1
            check 2
            check 3
            check 4
            all
            check 10
            check 20
            toggle 10
            remove 20
            check 10
            check 20
            empty
            check 1
            toggle 1
            check 1
            toggle 1
            check 1
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuffer sb = new StringBuffer();

            int cnt = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < cnt; i++) {
                st = new StringTokenizer(br.readLine());
                String type = st.nextToken();
                int input = -1;

                switch (type) {
                    case "all":
                        set = new HashSet<>();
                        for (int j = 1; j <= 20; j++) {
                            set.add(j);
                        }
                        break;
                    case "add":
                        set.add(Integer.parseInt(st.nextToken()));
                        break;
                    case "remove":
                        set.remove(Integer.parseInt(st.nextToken()));
                        break;
                    case "toggle":
                        input = Integer.parseInt(st.nextToken());
                        if (set.contains(input)) {
                            set.remove(input);
                        }
                        else {
                            set.add(input);
                        }
                        break;
                    case "empty":
                        set.clear();
                        break;
                    default:
                        input = Integer.parseInt(st.nextToken());
                        if (set.contains(input)) {
                            sb.append(1 + "\n");
                        }
                        else {
                            sb.append(0 + "\n");
                        }
                        break;
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