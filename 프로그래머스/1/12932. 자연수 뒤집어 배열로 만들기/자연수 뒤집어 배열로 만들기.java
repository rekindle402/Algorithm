import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();        
        
        while(n>0){
            int num = Long.valueOf(n%10).intValue();
            list.add(num);
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
    
        return answer;
    }
}