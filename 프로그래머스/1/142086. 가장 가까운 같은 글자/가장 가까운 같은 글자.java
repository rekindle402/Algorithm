import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        int[] alphabet = new int[26];
        int[] answer = new int[s.length()];
        Arrays.fill(alphabet, -1);
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int asciiNum = c - 'a';
            if(alphabet[asciiNum] == -1){
                answer[i] = -1;
            } else {
                answer[i] = i - alphabet[asciiNum];
            }
            alphabet[asciiNum] = i;
        }
        
        return answer;
    }
}