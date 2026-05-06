class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int medianNum = (total + num - 1) / num;
        int startNum = medianNum - (num/2);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = startNum++;
        }
        
        return answer;
    }
}