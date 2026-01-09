import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        //factorial();
        FizzBuzz();
    }

    public static void FizzBuzz() {
        /* 
            FizzBuzz 문제는 
            $i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.

            i가 3의 배수이면서 5의 배수이면 “FizzBuzz”를 출력합니다.
            i가 3의 배수이지만 5의 배수가 아니면 “Fizz”를 출력합니다.
            i가 3의 배수가 아니지만 5의 배수이면 “Buzz”를 출력합니다.
            i가 3의 배수도 아니고 5의 배수도 아닌 경우 i를 그대로 출력합니다.
            FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?

            <예시1>
            Fizz, Buzz, 11 -> Fizz

            <예시2>
            980803, 980804, FizzBuzz -> 980806
        */

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str1 = br.readLine();
            String str2 = br.readLine();
            String str3 = br.readLine();

            String result;
            int num = 0;
            if (isNumber(str1)) {
                num = Integer.parseInt(str1) + 3;
            }
            else if (isNumber(str2)) {
                num = Integer.parseInt(str2) + 2;
            }
            else {
                num = Integer.parseInt(str3) + 1;
            }


            if (num % 15 == 0) {
                result = "FizzBuzz";
            }
            else if (num % 3 == 0) {
                result = "Fizz";
            }
            else if (num % 5 == 0) {
                result = "Buzz";
            }
            else {
                result = Integer.toString(num);
            }
            
            bw.write(result);
            bw.flush();
            bw.close();
        }
        catch(Exception ex) {

        }

    }

    public static boolean isNumber(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException ex) {
            return false;
        }
    }
}