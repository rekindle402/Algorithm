class Solution {
    public int solution(int[] numbers) {
        int[] nums = new int[10];
        int answer = 0;
        
        for(int num : numbers){
            nums[num]++;
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                answer += i;
            }
            
        }
        return answer;
    }
}