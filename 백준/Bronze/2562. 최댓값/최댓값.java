import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int max = 0;
        int next = 0;

        for(int i = 0; i < 9; i++) {
            next = Integer.parseInt(br.readLine());
            if (max < next) {
                max = next;
                cnt = i+1;
            }
            else {

            }
        }

        bw.write(String.valueOf(max + "\n" + cnt));

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
