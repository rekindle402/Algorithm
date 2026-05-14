class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int n=left; n <= right; n++){
            int count = 0;
            for(int i = 1; i * i <= n; i++){
                if (n % i == 0){
                    count += (i * i == n) ? 1 : 2;
                }
            }
            answer += count%2==0 ? n : -n;
        }
        
        return answer;
    }
}