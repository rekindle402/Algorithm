import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int hIndex = 0;
        for(int i=citations.length-1; i >= 0; i--){
            if(citations[i] >= hIndex + 1){
                hIndex++;
            } else {
                break;
            }
        }
        
        return hIndex;
    }
}