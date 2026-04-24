class Solution {
    public int[] solution(int[] array) {
        int maxNum = array[0];
        int maxIndex = 0;
        
        for(int i=1; i<array.length; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
                maxIndex = i;
            }
        }
        return new int[] {maxNum, maxIndex};
    }
}