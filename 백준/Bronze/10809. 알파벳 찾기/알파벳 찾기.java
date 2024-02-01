import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] charArr = br.readLine().toCharArray();

        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (charIndexMap.containsKey(charArr[i])) {
                continue;
            }
            charIndexMap.put(charArr[i], i);
        }

        int rst = -1;
        for (char c = 'a'; c <= 'z'; c++) {
            if (charIndexMap.containsKey(c)) {
                bw.write(String.valueOf(charIndexMap.get(c)) + " ");
            } else {
                bw.write(String.valueOf(rst) + " ");
            }
        }
        
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}