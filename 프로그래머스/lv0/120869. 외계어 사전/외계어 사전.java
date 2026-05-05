import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<Character> spellSet = new HashSet<>();
        Set<Character> dicSet = new HashSet<>();
        
        for(int i=0; i<spell.length; i++){
            spellSet.add(spell[i].charAt(0));
        }
        
        for(String d : dic){
            dicSet.clear();
            char[] chars = d.toCharArray();
            for(char c : chars){
                dicSet.add(c);
            }
            if(spellSet.equals(dicSet)) return 1;
        }
        
        return 2;
    }
}