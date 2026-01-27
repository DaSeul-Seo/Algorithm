import java.util.*;
class Solution {
    public int solution(String num_str) {
        List<String> list = Arrays.asList(num_str.split(""));
        int result = 0;

        for (String s : list) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}