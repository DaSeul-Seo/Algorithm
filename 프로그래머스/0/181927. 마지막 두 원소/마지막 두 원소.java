import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i == num_list.length -1) {
                if (num_list[i] <= num_list[i-1]) {
                    list.add(num_list[i]);
                    list.add(num_list[i] * 2);
                }
                else {
                    list.add(num_list[i]);
                    list.add(num_list[i] - num_list[i-1]);
                }
            }
            else {
                list.add(num_list[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}