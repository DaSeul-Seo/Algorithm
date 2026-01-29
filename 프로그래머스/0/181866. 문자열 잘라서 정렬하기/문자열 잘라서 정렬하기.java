import java.util.*;
class Solution {
    public String[] solution(String myString) {
        myString = myString.replace('x', ' ').trim();

        String[] arr = myString.split("\\s+");

        Arrays.sort(arr);
        return arr;
    }
}