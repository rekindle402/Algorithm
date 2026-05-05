import java.lang.Math;

class Solution {
    public int solution(int[] sides) {
        int sum = sides[0]+sides[1]+sides[2];
        int max = Math.max(sides[0], Math.max(sides[1],sides[2]));
        return max<sum-max?1:2;
    }
}