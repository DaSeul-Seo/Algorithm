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
        DecompositionSum();
    }

    public static void DecompositionSum() {
        /*
            예제 1: abcde의 해시 값은 1 × 31의0승 + 2 × 311 + 3 × 312 + 4 × 313 + 5 × 314 = 1 + 62 + 2883 + 119164 + 4617605 = 4739715이다.
            예제 2: zzz의 해시 값은 26 × 310 + 26 × 311 + 26 × 312 = 26 + 806 + 24986 = 25818이다.
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int L = Integer.parseInt(br.readLine());
            long MOD = 1234567891L;
            String str = br.readLine();

            char[] list = str.toCharArray();

            long result = 0;
            long power = 1;
            for (int i = 0; i < L; i++) {
                int value = list[i] - 'a' + 1;
                result = (result + value * power) % MOD;
                power = (power * 31) % MOD;
            }

            sb.append(result);

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception exe) {

        }
    }
}