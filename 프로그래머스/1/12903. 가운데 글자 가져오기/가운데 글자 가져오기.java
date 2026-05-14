class Solution {
    public String solution(String s) {
        int startIndex = 0;
        int lastIndex = s.length()/2 + 1;
        
        startIndex = s.length() % 2 == 0 ? s.length()/2 - 1 : s.length()/2;
        
        return s.substring(startIndex, lastIndex);
    }
}