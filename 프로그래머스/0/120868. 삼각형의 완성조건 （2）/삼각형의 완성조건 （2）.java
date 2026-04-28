class Solution {
    public int solution(int[] sides) {
        int maxLength = Math.max(sides[0], sides[1]);
        int minLength = Math.min(sides[0], sides[1]); 
        
        // 1. 주어진 선분 중 하나가 가장 긴 경우 나머지 선분의 개수.
        int answer = maxLength - (maxLength - minLength);

        // 2. 주어진 변이 작은 경우
        int tmpLength = maxLength + 1;
        while (tmpLength < maxLength + minLength){
            answer++; 
            tmpLength++;
        }
            
        
        return answer;
    }
}