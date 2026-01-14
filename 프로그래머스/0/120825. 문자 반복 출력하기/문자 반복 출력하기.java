class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] strList = my_string.split("");

        for (String str :  strList) {
            for (int i = 0; i < n; i++) {
                answer += str;
            }
        }
        
        return answer;
    }
}