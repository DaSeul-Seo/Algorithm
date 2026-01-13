import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        BeeHouse();
    }

    public static void BeeHouse() {
        /*
            육각형으로 이루어진 벌집이 있다. 
            중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
            숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
            예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
            첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
            입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

            <예시>
            13 -> 3
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int room = Integer.parseInt(br.readLine());

            int cnt = 1;
            int range = 2;

            if (room == 1) {
                sb.append(cnt);
            }
            else {
                // 2-7 : 2
                // 8-19 : 3
                // 20-37 : 4
                // 38-61 : 5
                
                while (range <= room) {
                    range = range + (6 * cnt);
                    cnt++;
                }
                
                sb.append(cnt);
            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception ex) {

        }

    }
}