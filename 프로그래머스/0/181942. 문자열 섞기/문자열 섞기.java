import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        List<String> strList1 = Arrays.asList(str1.split(""));
        List<String> strList2 = Arrays.asList(str2.split(""));

        String result = "";

        for (int i = 0; i < strList1.size(); i++) {
            result += strList1.get(i);
            result += strList2.get(i);
        }

        return result;
    }
}