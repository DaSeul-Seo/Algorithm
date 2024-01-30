import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] intArr = new int[st.countTokens()];
        for (int i = 0; i < num; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = 1000000;
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }
            else if (max < intArr[i]) {
                max = intArr[i];
            }
        }
        bw.write(String.valueOf(min) + " " + String.valueOf(max));

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}