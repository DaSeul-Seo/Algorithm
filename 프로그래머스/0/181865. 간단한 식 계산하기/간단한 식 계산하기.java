import java.util.*;
class Solution {
    public int solution(String binomial) {
        List<String> list = Arrays.asList(binomial.split(" "));
        int result = 0;

        switch (list.get(1)) {
            case "+":
                result = Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(2));
                break;
            case "-":
                result = Integer.parseInt(list.get(0)) - Integer.parseInt(list.get(2));
                break;
            case "*":
                result = Integer.parseInt(list.get(0)) * Integer.parseInt(list.get(2));
                break;
            default:
                break;
        }
        return result;
    }
}