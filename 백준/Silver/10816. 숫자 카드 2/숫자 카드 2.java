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
        NumberCount2();

    }

    public static void NumberCount2() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            List<Integer> sourceList = new ArrayList<>();
            while(st.hasMoreTokens()) {
                sourceList.add(Integer.parseInt(st.nextToken()));   
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer> targetList = new ArrayList<>();
            while(st.hasMoreTokens()) {
                targetList.add(Integer.parseInt(st.nextToken()));
            }

            Map<Integer, Integer> map = new HashMap();

            for (int num : sourceList) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int target : targetList) {
                int cnt = map.getOrDefault(target, 0 );
                sb.append(cnt + " ");
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