import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index++] = num;
        }
    
        Arrays.sort(result);
    
        return result;
    }
}