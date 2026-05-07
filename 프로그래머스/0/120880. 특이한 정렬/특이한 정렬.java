import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] nums = new Integer[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            nums[i] = numlist[i];
        }

        Arrays.sort(nums, (a, b) -> {
            int distanceA = Math.abs(a - n);
            int distanceB = Math.abs(b - n);

            if (distanceA != distanceB) {
                return distanceA - distanceB;
            }

            return b - a;
        });

        int[] answer = new int[numlist.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
        }

        return answer;
    }
}