import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            String inputStr = "";
            
            while ((inputStr = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(inputStr);
                if (st.countTokens() != 1){
                    int cnt = Integer.parseInt(st.nextToken());
                    char[] inputArr = st.nextToken().toCharArray();
                    for (int i = 0; i < inputArr.length; i++) {
                        for (int j = 0; j < cnt; j++) {
                            bw.write(inputArr[i]);
                        }
                    }
                    bw.write("\n");
                }
            }
        }
        catch (Exception e) {
            
        }
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}