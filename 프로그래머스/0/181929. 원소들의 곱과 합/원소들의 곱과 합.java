import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            multiply *= num_list[i];
            sum += num_list[i];
        }

        if (multiply < Math.pow(sum, 2)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}