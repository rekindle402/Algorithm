class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c != ' '){
                if(index % 2 == 0){
                    c = Character.toUpperCase(c);
                } else {
                    c = Character.toLowerCase(c);
                }
                index++;
            } else {
                index = 0;
            }
            
            sb.append(c);
        }

        return sb.toString();
    }
}