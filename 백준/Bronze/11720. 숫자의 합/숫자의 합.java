import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        
        int[] intArr = new int[b.length()];
        for (int i = 0; i < b.length(); i ++) {
            intArr[i] = Integer.parseInt(String.valueOf(b.charAt(i)));
        }

        int result = 0;
        for (int i = 0; i < a; i++) {
            result += intArr[i];
        }

        bw.write(String.valueOf(result));
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
