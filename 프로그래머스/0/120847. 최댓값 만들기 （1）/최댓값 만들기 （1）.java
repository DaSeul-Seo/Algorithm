import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (Integer i : numbers) {
            list.add(i);
        }
        
        Collections.sort(list);
        
        int size = list.size();
        
        answer = list.get(size - 1) * list.get(size - 2);
        
        return answer;
    }
}