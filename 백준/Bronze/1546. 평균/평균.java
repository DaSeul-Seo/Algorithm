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
        
        int subject = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Double> scores = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scores.add(Double.parseDouble(st.nextToken()));
        }
        
        Collections.sort(scores);

        double max = scores.get(scores.size() - 1);
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.size(); i ++) {
            sum += scores.get(i) / max * 100;
        }
        avg = Math.round((sum  / subject) * 100) / 100.0;
        
        sb.append(avg);
        System.out.println(sb);
        bw.close();
        br.close();
    }
}