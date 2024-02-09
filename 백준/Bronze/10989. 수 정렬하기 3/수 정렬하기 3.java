import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[N];
        
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(intArr);

        for (Integer i: intArr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
        bw.close();
        br.close();
    }
}