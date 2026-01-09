import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        end666();
    }

    public static void end666() {
        /*
            종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다. 
            제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 이다. 
            따라서, 숌은 첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화의 제목은 "세상의 종말 1666"와 같이 이름을 지을 것이다. 
            일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수) 와 같다.

            첫째 줄에 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.

            <예시>
            2 -> 1666
            187 -> 66666
            500 -> 166699
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            int num = 666;
            int cnt = 1;
            
            while (cnt != n) {
                num++;

                if (String.valueOf(num).contains("666")) {
                    cnt++;
                }
            }

            sb.append(num);

            bw.write(sb.toString());
            bw.flush();
            bw.close();

        }
        catch(Exception ex) {

        }
    }
}