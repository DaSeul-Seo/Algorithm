class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double result = Math.sqrt(n);

        answer = Math.floor(result) == result ? 1 : 2;
        
        return answer;
    }
}