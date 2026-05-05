import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                numList.add(c-'0');
            }
        }
        numList.sort(null);
        return convertToArray(numList);
    }
    
    private int[] convertToArray(List<Integer> list){
        int[] arr = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            arr[j] = list.get(j).intValue();
        }
        return arr;
    }
}