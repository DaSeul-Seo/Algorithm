import java.util.*;
class Solution {
    public int solution(int n, String control) {
        List<String> list = Arrays.asList(control.split(""));
        int result = n;

        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "w":
                    result += 1;
                    break;
                case "s":
                    result -= 1;
                    break;
                case "d":
                    result += 10;
                    break;
                case "a":
                    result -=10;
                    break;
                default:
                    break;
            }
        }
         return result;
    }
}