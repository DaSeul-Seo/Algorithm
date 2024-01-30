import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        // List<Integer> numList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            result += Math.pow(a, 2);
        }

        bw.write(String.valueOf(result % 10));

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
