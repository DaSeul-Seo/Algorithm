class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();

        String a_str = Integer.toString(a);
        String b_str = Integer.toString(b);
        int ab_str = Integer.parseInt(a_str + b_str);
        int ab2 = 2 * a * b;
        int result = 0;

        if (ab_str > ab2) {
            result = ab_str;
        }
        else if (ab_str == ab2) {
            result = ab_str;
        }
        else {
            result = ab2;
        }

        return result;
    }
}