class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int moc = num_list[i];
            
            while (moc != 1) {
                if (moc % 2 == 0) {
                    moc = moc / 2; 
                }
                else {
                    moc = (moc - 1) / 2; 
                }
                result++;
            }
        }
        
        System.out.println(result);
        return result;
    }
}