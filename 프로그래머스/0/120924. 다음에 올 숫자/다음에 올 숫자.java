class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int lastIdx = common.length-1;
        if(isAP(common)){
            answer = common[lastIdx] + (common[lastIdx] - common[lastIdx - 1]);
        } else{
            answer = common[lastIdx] * (common[lastIdx] / common[lastIdx-1]);
        }
            
        return answer;
    }
    
    // 등차수열 판별    
    private boolean isAP(int[] arr){
        return arr[0] - arr[1] == arr[1] - arr[2];
    }
}