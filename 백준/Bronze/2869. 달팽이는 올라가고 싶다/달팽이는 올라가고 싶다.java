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
        StringBuilder sb = new StringBuilder();

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int tree = Integer.parseInt(st.nextToken());
        
        double checknum = tree - up;
        int checkDay = (int)(Math.ceil(checknum / (up - down)));
                
        sb.append(checkDay + 1);

        System.out.println(sb);

        // 버퍼 닫기
        bw.close();
        br.close();
    }
}