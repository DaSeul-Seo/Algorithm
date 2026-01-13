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
        WelcomeKit();
    }

    public static void WelcomeKit() {
        /*
            티셔츠는 S, M, L, XL, XXL, 그리고 XXXL의 6가지 사이즈가 있습니다. 티셔츠는 같은 사이즈의 T장 묶음으로만 주문할 수 있습니다.
            펜은 한 종류로, P자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있습니다.
            총 N명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은
            각각 S, M, L, XL, XXL, XXXL명입니다. 
            티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 합니다. 
            펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 합니다.
            티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.

            첫 줄에 참가자의 수 N이 주어집니다. (1 <= N <= 10^9)
            둘째 줄에 티셔츠 사이즈별 신청자의 수 S, M, L, XL, XXL, XXXL이 공백으로 구분되어 주어집니다. 
            (0 <= S, M, L, XL, XXL, XXXL <= N; S + M + L + XL + XXL + XXXL = N)
            셋째 줄에 정수 티셔츠와 펜의 묶음 수를 의미하는 정수 T와 P가 공백으로 구분되어 주어집니다. (2 <= T, P <= 10^9)

            첫 줄에 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지 출력하세요.
            다음 줄에 펜을 P자루씩 최대 몇 묶음 주문할 수 있는지와, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.

            S, M, L, XL, XXL 사이즈 티셔츠를 1묶음씩 구매하고 XXXL 사이즈 티셔츠를 2묶음 구매합니다.
            <예시>
            23
            3 1 4 1 5 9
            5 7
            ---
            7
            3 2
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int total = Integer.parseInt(br.readLine());
            List<Integer> sizeList = new ArrayList<>();
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 6; i++) {
                sizeList.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            int tCnt = Integer.parseInt(st.nextToken());
            int pCnt = Integer.parseInt(st.nextToken());

            int totalTCnt = 0;
            for (Integer size : sizeList) {
                if (size == 0) continue;
                // 장수
                if (tCnt >= size) {
                    totalTCnt++;
                    continue;
                }

                // 장수 넘었을때
                int otherCnt = (int)Math.ceil((double)size / tCnt);
                totalTCnt += otherCnt;
            }

            sb.append(totalTCnt + "\n");

            int mocPCnt = total / pCnt;
            int modPCnt = total % pCnt;

            sb.append(mocPCnt + " " + modPCnt);

            bw.write(sb.toString());
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception ex) {

        }
    }
}