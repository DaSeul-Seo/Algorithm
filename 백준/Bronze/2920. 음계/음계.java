import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        List<Integer> intList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }

        String rst = "";
        for (int i = 1; i < intList.size(); i++) {
            int comareInt = intList.get(i) - intList.get(i - 1);
            if (comareInt == 1) {
                rst = "ascending";
            }
            else if (comareInt == -1) {
                rst = "descending";
            }
            else {
                rst = "mixed";
                break;
            }
        }

        bw.write(rst);

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}