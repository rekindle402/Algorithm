class Solution {
    public int solution(int n) {
        // Worst Case : O(6);
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}