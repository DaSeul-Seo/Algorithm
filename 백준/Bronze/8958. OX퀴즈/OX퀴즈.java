import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            char[] strArr = br.readLine().toCharArray();
            int rst = 0;
            int cnt = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (Character.toString(strArr[j]).equals("O")) {
                    cnt += 1;
                    rst += cnt;
                }
                else {
                    cnt = 0;
                }
            }
            bw.write(String.valueOf(rst) + "\n");
        }
        
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}