import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int source = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        List<Integer> intList = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < source; i++) {
            int a = intList.get(i);
            if (a < target) {
                bw.write(String.valueOf(a) + " ");
            }
        }
        
        
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}