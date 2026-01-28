
class Solution {
    public int[] solution(String myString) {
        String[] list = myString.split("x", -1);
        int[] result = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            result[i] = list[i].length();
        }
        return result;
    }
}