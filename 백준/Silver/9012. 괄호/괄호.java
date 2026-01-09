import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Collections;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        Balance2();

    }

    public static void Balance2() {
        /*
            출력은 표준 출력을 사용한다. 
            만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 

            <예시>
            6
            (())())
            (((()())()
            (()())((()))
            ((()()(()))(((())))()
            ()()()()(()()())()
            (()((())()(
            ---
            NO
            NO
            YES
            NO
            YES
            NO
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();

            int T = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                String str = br.readLine();
                List<String> list = Arrays.asList(str.split(""));
                Stack<String> stack = new Stack<>();

                for (String s : list) {
                    
                    if (s.equals("(")) {
                        stack.push(s);
                    }

                    if (s.equals(")")) {
                        if (stack.isEmpty()) {
                            stack.push(s);
                            break;
                        }

                        if (stack.peek().equals("(")) {
                            stack.pop();
                        }
                        else { 
                            break;
                        }
                    }
                }

                if (stack.isEmpty()) {
                    sb.append("YES").append("\n");
                }
                else {
                    sb.append("NO").append("\n");
                }

            }

            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
        catch (Exception ex) {

        }

    }
}