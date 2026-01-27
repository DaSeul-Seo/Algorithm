import java.util.*;
class Solution {
    public String solution(String myString) {
        List<String> list = Arrays.asList(myString.split(""));
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i).charAt(0);
            if (num < 108) {
                result += "l";
            }
            else {
                result += list.get(i);
            }
        }
        
        return result;
    }
}