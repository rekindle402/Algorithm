class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rowSize = num_list.length / n;
        int[][] result = new int[rowSize][n];

        int index = 0;
        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < n; col++){
                result[row][col] = num_list[index++];
            }
        }
        
        return result;
    }
}
