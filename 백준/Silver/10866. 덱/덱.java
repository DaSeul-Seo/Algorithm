import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String function = st.nextToken();
            int num = 0;
            if (function.equals("push_front")) {
                num = Integer.parseInt(st.nextToken());
                queue.addFirst(num);
            }
            else if (function.equals("push_back")) {
                num = Integer.parseInt(st.nextToken());
                queue.addLast(num);
            }
            else if (function.equals("pop_front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.pollFirst()).append("\n");
                }
            }
            else if (function.equals("pop_back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(queue.pollLast()).append("\n");
                }
            }
            else if (function.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.peekFirst()).append("\n");
                }
            }
            else if (function.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else{
                    sb.append(queue.peekLast()).append("\n");
                }
            }
            else if (function.equals("size")) {
                    sb.append(queue.size()).append("\n");
            }
            else if (function.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1").append("\n");
                }
                else {
                    sb.append("0").append("\n");
                }
            }
            else {
                break;
            }
        }
        
        System.out.println(sb);
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}