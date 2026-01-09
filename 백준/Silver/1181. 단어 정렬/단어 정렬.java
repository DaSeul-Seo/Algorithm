import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // factorial();
        // FizzBuzz();
        // Isbn();
        wordSort();
    }

    public static void wordSort() {
        /*
            알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

            길이가 짧은 것부터
            길이가 같으면 사전 순으로
            단, 중복된 단어는 하나만 남기고 제거해야 한다.
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            
            int total = Integer.parseInt(br.readLine());
            List<String> strList = new ArrayList<>();

            for (int i = 0; i < total; i++) {
                strList.add(br.readLine());
            }

            // 중복제거
            Set<String> setList = new HashSet<>(strList);
            
            // 리스트 변환            
            List<String> list = new ArrayList<>(setList);

            // 정렬
            Collections.sort(list, (a, b) -> {
                if (a.length() != b.length()) {
                    return a.length() - b.length();   
                }
                return a.compareTo(b);
            });

            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

            bw.flush();
            bw.close();

        }
        catch(Exception ex) {

        }

    }
}