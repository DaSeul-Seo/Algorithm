import java.util.*;
class Solution {
    public String solution(String myString) {
        List<String> list = Arrays.asList(myString.split(""));
        String result = "";

        for (String s : list) {
            if (s.equals("a") || s.equals("A")) {
                result += s.toUpperCase();
            }
            else {
                result += s.toLowerCase();
            }
        }

        return result;
    }
}