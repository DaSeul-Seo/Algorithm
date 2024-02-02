import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String num = br.readLine();
            if (num.equals("0")) {
                break;
            }
            
            char[] charArr = num.toCharArray();
            int validNum = charArr.length / 2;
            String front = "";
            String back = "";
            if (charArr.length % 2 == 0) {
                front = num.substring(0, validNum);
                for (int i = charArr.length -1; i >= validNum; i--) {
                    back = back + charArr[i];
                }
            }
            else{
                front = num.substring(0, validNum);
                for (int i = charArr.length -1; i >= validNum+1; i--) {
                    back = back + charArr[i];
                }
            }
            
            if (front.equals(back)) {
                sb.append("yes").append("\n");
            }
            else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
        bw.close();
        br.close();
    }
}