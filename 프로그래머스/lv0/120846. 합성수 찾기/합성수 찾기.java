class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 합성수는 4부터 등장.
        for(int i = 4; i <= n; i++){
            if (isComposite(i)){
                count++;
            }
        }
        return count;
    }
    
    private boolean isComposite(int number){
        int root = (int) Math.sqrt(number);

        for (int i = 2; i <= root; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}