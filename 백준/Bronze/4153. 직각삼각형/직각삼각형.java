import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (;;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            
            int max = Math.max(w, h);
            int min = Math.min(w, h);
            int finalMax = Math.max(max, s);
            int finalMin = Math.min(max, s);

            if (w == 0 && h == 0 && s == 0){
                break;
            }
    
            if (Math.pow(finalMax, 2) == Math.pow(finalMin, 2) + Math.pow(min, 2)) {
                bw.write("right\n");
            }
            else {
                bw.write("wrong\n");
            }
        }

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
