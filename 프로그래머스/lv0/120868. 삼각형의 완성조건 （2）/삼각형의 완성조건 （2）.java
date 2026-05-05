class Solution {
    public int solution(int[] sides) {
        int minLength = Math.min(sides[0], sides[1]);

        return 2 * minLength - 1;
    }
}