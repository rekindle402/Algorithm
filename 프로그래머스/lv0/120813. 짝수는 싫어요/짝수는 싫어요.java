class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int[] result = new int[size];
        
        int index = 0;
        for(int i=1; i<=n; i+=2){
            result[index] = i;
            index++;
        }
        
        return result;
    }
}