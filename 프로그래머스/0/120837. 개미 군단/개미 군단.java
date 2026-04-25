class Solution {
    public int solution(int hp) {
        int[] damages = {5,3,1};
        int answer = 0;
        
        for(int i = 0; i < damages.length; i++){
            answer += hp / damages[i];
            hp %= damages[i];
        }
        
        return answer;
    }
}