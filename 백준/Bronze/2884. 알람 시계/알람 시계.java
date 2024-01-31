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
        
        int hour = Integer.parseInt(st.nextToken());
        int mini = Integer.parseInt(st.nextToken());

        mini -= 45;
		
		if(mini < 0) {
			if(hour == 0) {
				hour = 23;
				mini = 60 + mini;
			} else {
				hour -= 1;
				mini = 60 + mini;
			}
		}

        bw.write(String.valueOf(hour + " " + mini));
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}