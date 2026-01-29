import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < included.length; i++) {
            if (i == 0) {
                numList.add(a);
                continue;
            }
            numList.add(numList.get(i-1) + d);
        }

        int result = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                result += numList.get(i);
            }
        }

        return result;
    }
}