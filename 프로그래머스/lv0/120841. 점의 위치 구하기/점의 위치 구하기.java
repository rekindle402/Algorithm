class Solution {
    public int solution(int[] dot) {
        int[][] position = {{2,1},
                            {3,4}};
        
        int x = dot[0] > 0 ? 1:0;
        int y = dot[1] > 0 ? 0:1;
        
        return position[y][x];
    }
}