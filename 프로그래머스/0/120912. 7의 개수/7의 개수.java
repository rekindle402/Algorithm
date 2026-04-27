class Solution {
    private static final int TARGET = 7;
    public int solution(int[] array) {
        int result = 0;
        for(int num : array){
            while(num > 0){
                if(num % 10 == TARGET) result++;
                num /= 10;
            }
        }
        return result;
    }
}