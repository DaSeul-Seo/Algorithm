class Solution {
    public int solution(int[][] arr) {
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            else {
                break;
            }
        }

        return flag ? 1 : 0;
    }
}