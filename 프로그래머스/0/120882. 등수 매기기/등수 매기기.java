import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        
        int[] totalScore = calcTotal(score);
        int[] rank = new int[totalScore.length];
        Arrays.fill(rank, 1);
        
        
        for(int i=0; i<totalScore.length; i++){
            int key = totalScore[i];
            for(int j=0; j<totalScore.length; j++){
                if(key < totalScore[j]){
                    rank[i]++;
                }
            }
        }
        
        return rank;
    }
    
    private int[] calcTotal(int[][] scores){
        int[] totalScores = new int[scores.length];
        
        for(int i=0; i<scores.length; i++){
            totalScores[i] = scores[i][0] + scores[i][1];
        }
        
        return totalScores;
    }
}