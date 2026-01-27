import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            
            if (n % 2 == 0) {
                sb.append(n + " is even");
            }
            else {
                sb.append(n + " is odd");
            }

            br.close();
            bw.write(sb.toString());
            bw.flush();
            bw.close();

        }
        catch (Exception ex) {

        }
    }
}