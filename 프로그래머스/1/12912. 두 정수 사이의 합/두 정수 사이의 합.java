class Solution {
    public long solution(int a, int b) {
        int count = Math.max(a,b) - Math.min(a,b) + 1;
        double avg = (double)(a+b)/2;
        
        return (long)(count * avg);
    }
}