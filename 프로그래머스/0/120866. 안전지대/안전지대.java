class Solution {
    private static final int[][] D_POSITION = 
    {{-1, -1}, {-1, 0}, {-1, 1},{0,-1},{0,1},{1,-1}, {1,0}, {1,1}};
    
    private static int SAFE = 0; 
    private static int BOMB = 1;
    private static int DANGER = 2;
    
    public int solution(int[][] board) {
        int size = board.length;
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == 1){
                    for(int k=0; k < D_POSITION.length; k++){
                        int dy = i + D_POSITION[k][0];
                        int dx = j + D_POSITION[k][1];
                        
                        if(dy >= 0 && dy < size && dx >= 0 && dx < size){
                            if(board[dy][dx] != 1){
                                board[dy][dx] = DANGER;
                            }
                        } 
                    }
                }
            }
        }
        
        return conutSafe(board);
    }
    
    // 안전지역 숫자 카운트
    private int conutSafe(int[][] boards){
        int count = 0;
        for(int i=0; i < boards.length; i++){
            for(int j=0; j < boards[i].length; j++){
                if(boards[i][j] == 0) count++;
            }
        }
        return count;
    }
}