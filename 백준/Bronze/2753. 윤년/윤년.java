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

        int a = Integer.parseInt(st.nextToken());
        
        if (a % 4 == 0 && a % 100 != 0) {
            bw.write("1");
        }
        else if (a % 100 == 0 && a % 400 != 0) {
            bw.write("0");
        }
        else if (a % 400 == 0) {
            bw.write("1");
        }
        else {
            bw.write("0");
        }
        
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}