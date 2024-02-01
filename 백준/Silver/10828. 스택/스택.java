import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String function = st.nextToken();
            int num = 0;
            if (function.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if (function.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                }
                else{
                    bw.write(String.valueOf(stack.peek()) + "\n");
                }
            }
            else if (function.equals("size")) {
                    bw.write(stack.size() + "\n");
            }
            else if (function.equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                }
                else {
                    bw.write("0\n");
                }
            }
            else if (function.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                }
                else {
                    bw.write(String.valueOf(stack.peek()) + "\n");
                    stack.pop();
                }
            }
            else {
                break;
            }
        }
        

        // bw.write(result);

        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}