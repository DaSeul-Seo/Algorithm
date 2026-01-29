class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        String result = "";

        for (Integer s : indices) {
            arr[s] = "";
        }
        return String.join("",arr);
    }
}