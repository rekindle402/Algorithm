class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        for(int num = i; num <= j; num++){
            int target = num;
            while(target > 0){
                if(target % 10 == k){
                    result++;
                }
                target /= 10;
            }
        }
        return result;
    }
}