class Solution {
    public int solution(String my_string) {
        my_string = my_string.replace(" ", "");
        my_string = my_string.replace("-", "+-");
        
        String[] nums = my_string.split("\\+");
        int sum = 0;
        for (String num : nums) {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }
}