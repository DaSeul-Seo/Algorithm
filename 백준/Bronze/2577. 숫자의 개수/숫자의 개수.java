import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Map<String, Integer> rstMap = new HashMap<>();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        String result = String.valueOf(a * b * c);

        for (char s : result.toCharArray()) {
            rstMap.putIfAbsent(String.valueOf(s), 0);

            int cnt = rstMap.get(String.valueOf(s));
            rstMap.put(String.valueOf(s), cnt + 1);
        }
        
        for (int i = 0; i < 10; i++) {
            if (rstMap.get(String.valueOf(i)) == null) {
                bw.write("0\n");
            }
            else {
                bw.write(String.valueOf(rstMap.get(String.valueOf(i))) + "\n");
            }
        }

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
