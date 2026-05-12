class Solution {
    public String solution(String phone_number) {
        String mask = "*";
        int length = phone_number.length();
        
        return mask.repeat(length-4) + phone_number.substring(length-4, length);
    }
}