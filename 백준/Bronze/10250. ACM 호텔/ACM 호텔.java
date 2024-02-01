import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //  T 개의 테스트 데이터
        // H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i ++) {
            String result = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 층
            int H = Integer.parseInt(st.nextToken());
            // 방
            int W = Integer.parseInt(st.nextToken());
            // 손님
            int N = Integer.parseInt(st.nextToken());

            // 층
            int floor = N % H;
            
            // 방
            int room = (N / H) + 1;

            if (floor == 0) {
                floor = H;
                room -= 1;
            }

            String transRoom = String.format("%02d", room);

            // 결과
            result = String.valueOf(floor) + transRoom;
            
            bw.write(result + "\n");
        }
        
        
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}

/*
3
6 12 1
6 12 72
6 12 66


 */