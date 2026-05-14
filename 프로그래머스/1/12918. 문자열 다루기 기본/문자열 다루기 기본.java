class Solution {
    public boolean solution(String s) {
        int length = s.length();
        if(length == 4 || length == 6){
            for(int i=0; i < length; i++){
                char c = s.charAt(i);
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            return true;
        } 
        return false;
    }
}