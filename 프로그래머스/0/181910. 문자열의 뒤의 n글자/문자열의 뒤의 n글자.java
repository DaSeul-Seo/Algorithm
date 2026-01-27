import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        list = Arrays.asList(my_string.split(""));

        int cnt = list.size() - n;

        for (int i = cnt; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}