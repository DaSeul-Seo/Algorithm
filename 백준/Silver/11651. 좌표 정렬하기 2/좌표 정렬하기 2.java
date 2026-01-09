import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Collections;

// Comparator => 음수 : a가 b보다 앞, 0 : 순서유지, 양수, b가 a보다 앞
public class Main {
    public static void main(String[] args) throws Exception {
        CoordinateSort2();

    }

    public static void CoordinateSort2() {
        /*
            2차원 평면 위의 점 N개가 주어진다. 
            좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력

            <예시>
            5
            0 4
            1 2
            1 -1
            2 2
            3 3
            ---
            1 -1
            1 2
            2 2
            3 3
            0 4
        */

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            
            List<String[]> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                list.add(new String[]{st.nextToken(), st.nextToken()});
            }

            list.sort((a, b) -> {
                if (!a[1].equals(b[1])) {
                    return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
                }
                else {
                    return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
                }
            });

            for (String[] s : list) {
                sb.append(s[0]).append(" ").append(s[1]);
                sb.append("\n");
            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
        catch(Exception ex) {

        }
    }
}