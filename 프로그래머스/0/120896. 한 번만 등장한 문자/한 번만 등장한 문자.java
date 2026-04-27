class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        
        for(int i=0; i < s.length(); i++){
            int index = (int) s.charAt(i) - 'a';
            alphabet[index] += 1;
        }
        
        for(int j=0; j < alphabet.length; j++){
            if(alphabet[j] == 1){
                sb.append((char)('a'+j));
            }
        }
        
        return sb.toString();
    }
}