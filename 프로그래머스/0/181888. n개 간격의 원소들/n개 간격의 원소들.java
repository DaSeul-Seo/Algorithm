import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i = i+n) {
            list.add(num_list[i]);
        }

        int arrListSize = list.size();
        Integer[] result = list.toArray(new Integer[arrListSize]);
        
        int[] intArr = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            intArr[i] = result[i];
        }

        return intArr;
    }
}