import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        List<String> list = Arrays.asList(my_string.split(""));
        String result = "";
        
        for (String s : list) {
            if (s.equals(alp)) {
                String str = s.toUpperCase();
                result += str;
            }
            else {
                result += s;
            }
        }
        return result;
    }
}