import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> result = new ArrayList<>();
        for(int i : numlist){
            // 배수 판별
            if(i%n==0){
                result.add(i);
            } 
        }
        return convertArray(result);
    }
    
    private int[] convertArray(List<Integer> list){
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i).intValue();
        }
        return arr;
    }
}