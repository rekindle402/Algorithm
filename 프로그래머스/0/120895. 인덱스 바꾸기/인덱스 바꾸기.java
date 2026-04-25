class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        
        char target1 = my_string.charAt(num1);
        char target2 = my_string.charAt(num2);
        
        sb.replace(num1, num1+1, Character.toString(target2));
        sb.replace(num2, num2+1, Character.toString(target1));
        // sb.replace(num1, num1+1, Character.toString(my_string.charAt(num2)));
        // sb.replace(num2, num2+1, Character.toString(my_string.charAt(num1)));
        return sb.toString();
    }
}