import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        factorial();
    }

    public static void factorial() {
        // N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
        // 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
        // 예시
        // 10 -> 2
        // 3 -> 0
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String inputStr = br.readLine();
            int n = Integer.parseInt(inputStr);

            int count = 0;

            while (n >= 5) {
                n /= 5;
                count += n;
            }

            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
        }
        catch(Exception ex) {
        }
    }
}
