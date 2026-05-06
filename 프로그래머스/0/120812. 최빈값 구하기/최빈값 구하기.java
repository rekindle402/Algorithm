import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        int maxCount = 0;
        int maxNum = 0;
        
        for(int num : array){
            count[num]++;
        }
        
        for(int i=0; i<count.length; i++){
            if(count[i] > maxCount){
                maxNum = i;
                maxCount =  count[i];
            } else if(count[i] == maxCount){
                maxNum = -1;
            }
        }
        
        return maxNum;
    }
}