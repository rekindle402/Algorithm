class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == 'p' || c == 'P'){
                countP++;
            } else if(c == 'y' || c == 'Y'){
                countY++;
            }
        }
        
        return countP==countY;
    }
}