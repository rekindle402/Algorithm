import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 정확한 금액 만큼만 지원
        // 낮은 가격부터 지원.

        Arrays.sort(d);
        int count = 0;
        
        for(int i=0; i<d.length; i++){
            budget -= d[i];
            count++;
            if(budget < 0){
                count--;
                break;
            }
        }
       
        return count;
    }
}