import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        for (Integer i : numlist) {
            if (i % n != 0) continue;
            list.add(i);
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}