import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int value = 0;

        while (value < n) {
            value += k;
            if (value > n) {
                break;
            }
            list.add(value);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}