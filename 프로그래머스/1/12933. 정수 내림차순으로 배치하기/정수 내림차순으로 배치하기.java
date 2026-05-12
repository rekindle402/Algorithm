import java.util.Arrays;

class Solution {
    public long solution(long n) {
        int[] digits = new int[10];
        long answer = 0;
        
        while(n > 0){
            int num = (int)(n%10);
            digits[num]++;
            n /= 10;
        }
        
        for(int i=digits.length-1; i>=0; i--){
            int count = digits[i];
            for(int j=0; j<count; j++){
                answer = answer * 10 + i;
            }
        }
        
        return answer;
    }
}