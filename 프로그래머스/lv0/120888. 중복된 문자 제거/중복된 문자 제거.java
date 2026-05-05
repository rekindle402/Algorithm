import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        
        for(int i = 0; i < my_string.length(); i++){
            set.add(my_string.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : set){
            sb.append(ch);
        }
        
        return sb.toString();
        
        
//         StringBuilder sb = new StringBuilder(my_string);
        
//         for(int i=sb.length()-1; i>=0; i--){
//             String target = Character.toString(sb.charAt(i));
            
//             if(sb.indexOf(target) != i){
//                 sb.deleteCharAt(i);
//             }
            
//         }
//         return sb.toString();
    }
}