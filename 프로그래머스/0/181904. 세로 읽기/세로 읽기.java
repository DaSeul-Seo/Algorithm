class Solution {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length();
        int cnt = len/m;

        int idx = 0;
        String[][] arr = new String[cnt][m];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(my_string.charAt(idx++));
            }
        }

        String result = "";
        for (int i = 0; i < cnt; i++) {
            result += arr[i][c-1];
        }
        return result;
    }
}