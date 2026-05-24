class Solution {
    public String solution(String s) { 
        StringBuilder sb = new StringBuilder();
        
        boolean isFirst = true;
        for(char c : s.toCharArray()){
            if(c == ' '){
                isFirst = true;
            } else {
                if(isFirst){
                    c = Character.toUpperCase(c);
                    isFirst = false;
                } else {
                    c = Character.toLowerCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}