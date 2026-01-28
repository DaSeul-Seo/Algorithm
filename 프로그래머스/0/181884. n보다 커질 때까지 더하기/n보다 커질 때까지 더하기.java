class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for (Integer s : numbers) {
            if (sum > n) break;
            sum += s;
        }

        return sum;
    }
}