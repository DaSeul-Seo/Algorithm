import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = Arrays.asList(my_string.split(""));
        String result = "";

        for (String s : list) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) continue;
            result += s;
        }
        return result;
    }
}