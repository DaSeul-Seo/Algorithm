import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 10; i++){
            int mod = Integer.parseInt(br.readLine());
            intSet.add(mod % 42);
        }

        bw.write(String.valueOf(intSet.size()));

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}