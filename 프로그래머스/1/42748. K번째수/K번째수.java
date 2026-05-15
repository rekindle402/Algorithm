import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int result[] = new int[commands.length];
        int resultIdx = 0;

        for(int a=0; a<commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
        
            int[] tmp = new int[j - i + 1];
            int index = 0;
            
            for(; i <= j; i++){
                tmp[index++] = array[i-1];
            }
            
            Arrays.sort(tmp);
            result[resultIdx++] = tmp[k-1];
            
        }
        return result;
    }
}