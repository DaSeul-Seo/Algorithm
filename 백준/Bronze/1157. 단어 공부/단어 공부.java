import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String inputStr = st.nextToken().toUpperCase();
        Map<String, Integer> rstMap = new HashMap<>();
        
        String mKey = "";
        int mValue = 0;

        if (inputStr.length() == 1) {
            bw.write(inputStr);    
        }
        else {
            for (char c : inputStr.toCharArray()) {
                // rstMap에 없는 키인 경우 초기값 0으로 설정
                rstMap.putIfAbsent(String.valueOf(c), 0);

                // 해당 문자의 카운트 증가
                int cnt = rstMap.get(String.valueOf(c));
                rstMap.put(String.valueOf(c), cnt + 1);
            }
            
            for (Map.Entry<String, Integer> entry : rstMap.entrySet()) {
                if (entry.getValue() > mValue) {
                    mValue = entry.getValue();
                    mKey = entry.getKey();
                }
                else if (entry.getValue() == mValue) {
                    mKey = "?";
                }
            }
        }


        // 버퍼에 담기
        bw.write(String.valueOf(mKey));
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}