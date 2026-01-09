import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // factorial();
        // FizzBuzz();
        Isbn();
    }

    public static void Isbn() {
        /*
            ISBN(International Standard Book Number)은 전 세계 모든 도서에 부여된 고유번호로, 국제 표준 도서번호이다.
            ISBN에는 국가명, 발행자 등의 정보가 담겨 있으며 13자리의 숫자로 표시된다.
            그중 마지막 숫자는 체크기호로 ISBN의 정확성 여부를 점검할 수 있는 숫자이다.
            이 체크기호는 일련번호의 앞에서부터 각 자리마다 가중치 1, 3, 1, 3…. 를 곱한 것을 모두 더하고, 
            그 값을 10으로 나눈 나머지가 0이 되도록 만드는 숫자 m을 사용한다. 수학적으로는 다음과 같다.

            ISBN이 abcdefghijklm 일 때, a+3b+c+3d+e+3f+g+3h+i+3j+k+3l+m ≡ 0 (mod 10)
            즉, 체크기호 m = 10 - (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) mod 10 이다.
            단, 10으로 나눈 나머지 값이 0일 경우 체크기호는 0이다.
            ISBN 13자리 숫자가 입력된다. 훼손된 숫자는 *로 표시한다. (훼손된 일련번호는 체크기호를 제외한 무작위 한 자리이다.)

            <예시>
            9788968322*73 -> 2
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String inputStr = br.readLine();

            List<String> list = new ArrayList<>();

            for (char c : inputStr.toCharArray()) {
                list.add(String.valueOf(c));
            }
            
            int sumNum = 0; // isbn 합
            int cnt = 0;    // *의 인덱스
            int result = 0; // 결과값

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals("*")) {
                    cnt = i;
                    continue;
                }

                if (i == 0) {
                    sumNum += Integer.parseInt(list.get(i));
                    continue;
                }

                if (i % 2 == 0) {
                    sumNum += Integer.parseInt(list.get(i));
                }
                else {
                    sumNum += 3 * Integer.parseInt(list.get(i));
                }
            }

            int num = 0;
            while (true) {
                if (cnt % 2 == 0) {
                    if ((sumNum + num) % 10 == 0) {
                        result = num;
                        break;
                    }
                }
                else {
                    if ((sumNum + (num * 3)) % 10 == 0) {
                        result = num;
                        break;
                    }
                }
                num++;
            }

            bw.write(Integer.toString(result));
            bw.flush();
            bw.close();

        }
        catch(Exception ex) {
            
        }

    }
}