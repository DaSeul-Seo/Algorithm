import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long k = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        List<Long> intList = new ArrayList<>();

        for (int i = 0; i < k; i++){
            intList.add(Long.parseLong(br.readLine()));
        }
        
        Collections.sort(intList);
        
        long min = 1;
        long max = intList.get(intList.size()-1);
        long rst = 0;
        
        for (;;) {
            if(min > max) break;

            long result = 0;
            long avg = (min + max) / 2;
            for (int i = 0; i < intList.size(); i++) {
                long mod = intList.get(i) / avg;
                result += mod;
            }
            if (result < n) {
                max = avg - 1;    
            }
            else {
                rst = avg;
                min = avg + 1;
            }
        }

        sb.append(rst);
        System.out.println(sb);
        bw.close();
        br.close();
    }
}