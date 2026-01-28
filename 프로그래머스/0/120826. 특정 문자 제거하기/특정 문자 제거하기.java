import  java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        List<String> list = Arrays.asList(my_string.split(""));
        String result = "";

        for (String s : list) {
            if (s.equals(letter)) continue;
            result += s;
        }
        return result;
    }
}