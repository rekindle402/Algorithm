import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        Arrays.sort(score);
        
        int count = 0;
        for(int i=score.length; i > 0; i--){
            count++;
            if(count == m){
                count = 0;
                result += score[i-1] * m;
            }
        }
        
        return result;
    }
}