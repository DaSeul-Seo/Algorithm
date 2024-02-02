import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int inputCnt = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < inputCnt; i++) {
            intList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(intList);

        for (int i = 0; i < intList.size(); i++) {
            sb.append(intList.get(i)).append("\n");
        }

        System.out.println(sb);
        bw.close();
        br.close();
    }
}