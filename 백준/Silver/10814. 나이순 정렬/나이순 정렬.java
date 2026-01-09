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
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ageSort();
    }

    public static void ageSort() {
        /*
            온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
            이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬

            <예시>
            3
            21 Junkyu
            21 Dohyun
            20 Sunyoung
            ---
            20 Sunyoung
            21 Junkyu
            21 Dohyun

        */
        try {
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
                if (!a[0].equals(b[0])) {
                    return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
                }
                else {
                    return 0;
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