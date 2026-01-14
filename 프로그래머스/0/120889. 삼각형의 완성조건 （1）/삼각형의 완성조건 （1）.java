import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for (Integer i : sides) {
            list.add(i);
        }
    
        Collections.sort(list);
        
        int sum = list.get(0) + list.get(1);

        if (list.get(2) < sum) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        
        return answer;
    }
}