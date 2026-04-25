class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] result = new int[length];
        
        if(direction.equals("right")){
            result[0] = numbers[length-1];
            for(int i = 0; i < length-1; i++){
                result[i+1] = numbers[i];
            }
        } else {
            result[length-1] = numbers[0];
            for(int i = length-1; i > 0; i--){
                result[i-1] = numbers[i];
            }
        }
        
        return result;
    }
}