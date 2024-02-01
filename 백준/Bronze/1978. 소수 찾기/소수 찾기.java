import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rstCnt = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }
            int cnt = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    cnt += 1;
                    break;
                }
            }
            if (cnt == 0) {
                rstCnt += 1;
            }
        }

        bw.write(String.valueOf(rstCnt));
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}

/*
소수찾기
4
1 3 5 7


 */