import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int inNum = Integer.parseInt(st.nextToken());
        int maxNum = Integer.parseInt(st.nextToken());
        int compareNum = 0;

        // 입력받은 값을 리스트에 담기
        List<Integer> intList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }

        // 반복문을 통해 3자리 숫자를 합 구하기
        // maxNum과 같으면 break 아니면 가까운 숫자를 찾는다.
        boolean flag = true;
        for (int i = 0; i < intList.size(); i++) {
            if (!flag) {
                break;
            }
            for (int j = i + 1; j < intList.size(); j++) {
                if (!flag) {
                    break;
                }
                for (int k = j + 1; k < intList.size(); k++){
                    int sum = intList.get(i) + intList.get(j) + intList.get(k);
                    if (sum == maxNum) {
                        compareNum = sum;
                        flag = false;
                        break;
                    }
                    else if (sum < maxNum && sum > compareNum) {
                        compareNum = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(compareNum));
        // 내용 출력
        bw.flush();
        // 버퍼 닫기
        bw.close();
        br.close();
    }
}