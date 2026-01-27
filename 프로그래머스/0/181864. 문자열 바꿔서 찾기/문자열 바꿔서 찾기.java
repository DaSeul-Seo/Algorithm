import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        List<String> strList = Arrays.asList(myString.split(""));
        String result = "";

        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).endsWith("A")) {
                result += "B";
            }
            else {
                result += "A";
            }
        }

        return result.contains(pat) ? 1 : 0;
    }
}