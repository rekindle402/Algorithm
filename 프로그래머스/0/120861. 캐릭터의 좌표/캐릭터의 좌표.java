class Solution {
    private static final int[][] MOVE = {{1,0},{-1,0},{0,-1},{0,1}};
    public int[] solution(String[] keyinput, int[] board) {
        int[] currentPosition = {0,0};
        
        for(String s : keyinput){
            int order = switch(s){
                case "up" -> 0;
                case "down" -> 1;
                case "left" -> 2;
                case "right" -> 3;
                default -> 0;
            };
            
            int dx = MOVE[order][1];
            int dy = MOVE[order][0];
            
            if(isMoveable(dx, dy, board, currentPosition)){
                currentPosition[0] += dx;
                currentPosition[1] += dy;
            }
            
        }    
        return currentPosition;
    }
    private boolean isMoveable(int dx, int dy, int[] board, int[] currentPosition){
        int borderX = board[0] / 2;
        int nextX = currentPosition[0] + dx;
        
        int borderY = board[1] / 2;
        int nextY = currentPosition[1] + dy;
        
        return Math.abs(nextX) <= borderX && + Math.abs(nextY) <= borderY;
    }
}