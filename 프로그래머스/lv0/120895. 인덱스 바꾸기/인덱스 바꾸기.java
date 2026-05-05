class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        
        char target1 = my_string.charAt(num1);
        char target2 = my_string.charAt(num2);

        sb.setCharAt(num1, target2);
        sb.setCharAt(num2, target1);
        
        return sb.toString();
    }
}