class Solution {
    public int solution(int balls, int share) {
        int r = Math.min(share, balls - share);
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (balls - r + i) / i;
        }

        return (int) result;
    }
}