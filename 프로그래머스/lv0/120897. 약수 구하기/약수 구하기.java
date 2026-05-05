class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for(int j=1; j <= n; j++){
            if(n % j == 0){
                result[index] = j;
                index++;
            }
        }
        
        return result;
        
    }
}