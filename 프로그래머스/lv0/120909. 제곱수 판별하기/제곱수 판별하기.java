class Solution {
    public int solution(int n) {
        // 제곱근까지만 확인하면 되므로 i * i <= n 범위만 탐색
        for(int i=1; i*i <= n; i++){
            if(i*i==n) {
                return 1;
            }
        }
        return 2;
    }
}