class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int index = 0;
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}