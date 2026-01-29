class Solution {
    public int solution(int n) {
        int result = 0;
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result += Math.pow(i, 2);
                }
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    result += i;
                }
            }
        }
        return result;
    }
}