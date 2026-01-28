import java.util.*;
class Solution {
    public String solution(String rny_string) {
        List<String> list = Arrays.asList(rny_string.split(""));
        String result = "";

        for (String s : list) {
            if (s.equals("m")) {
                result += "rn";
            }
            else {
                result += s;
            }
        }
        return result;
    }
}