import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        int[] answer = new int[]{0, 0};
        
        usedWords.add(words[0]);
        String lastWord = words[0];
        
        for(int i=1; i < words.length; i++){
            String word = words[i];
            if(isPass(usedWords, word, lastWord)){
                usedWords.add(word);
                lastWord = word;
            } else {
                answer[0] = (usedWords.size() % n) + 1;
                answer[1] = (usedWords.size() / n) + 1;
                return answer;
            }
        }
        
        return answer;
    }
    
    private boolean isPass(Set<String> usedWords, String word, String lastWord){
        if(usedWords.contains(word)) return false;
        
        char lastAlphabet = lastWord.charAt(lastWord.length()-1);
        char startAlphabet = word.charAt(0);
        
        return lastAlphabet == startAlphabet;
    }
}