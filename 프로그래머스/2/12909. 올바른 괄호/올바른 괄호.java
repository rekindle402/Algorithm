class Solution {
    boolean solution(String s) {
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;
        
        int result = 0;
        for(char c : s.toCharArray()){
            result += c == '(' ? 1 : -1;
            if(result < 0) return false;
        }
        
        return result == 0 ? true : false;
    }
}