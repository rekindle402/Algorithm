import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int pickUpSize = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, 0);
        }

        return pickUpSize <= map.size() ? pickUpSize : map.size();
    }
}