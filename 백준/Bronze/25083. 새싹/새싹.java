import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("         ,r'\"7\n");
        bw.write("r`-_   ,'  ,/\n");
        bw.write(" \\. \". L_r'\n");
        bw.write("   `~\\/\n");
        bw.write("      |\n");
        bw.write("      |");

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}
