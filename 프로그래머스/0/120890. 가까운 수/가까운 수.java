class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        int currentDistance = Math.abs(array[0] - n);
    
        for(int num : array){
            int distance = num - n;
            if(distance < 0) distance *= -1;
            
            if(currentDistance == distance){
                if(num < result){
                    result = num;
                }    
            } else if(distance < currentDistance){
                result = num;
                currentDistance = distance;                
            }
        }
        
        return result;
    }
}