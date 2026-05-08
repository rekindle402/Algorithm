import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int prevNum = -1;
        
        for(int num : arr){
            if(num != prevNum){
                list.add(num);
                prevNum = num;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}