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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // nCk = n! / (n-k)!k!
        int result = 0;
        int up = 1;
        int down = 1;
        int mid = 1;
        for (int i = 1; i <= N; i++) {
            up *= i;
        }
        for (int k = 2; k<= K; k++) {
            down *= k;
        }
        for (int n = 1; n<= N-K; n++){
            mid *= n;
        }

        result = up / (mid * down);

        sb.append(result);
        System.out.println(sb);
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}

/*

 */