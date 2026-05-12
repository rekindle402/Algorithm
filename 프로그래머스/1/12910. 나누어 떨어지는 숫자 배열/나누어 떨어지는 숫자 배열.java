import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(num%divisor==0){
                list.add(num);
            }
        }
        
        if(list.size() != 0){
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
        
        return new int[] {-1};
            
    }
}