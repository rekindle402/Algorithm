class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        // O(n)
        for(int i=0; i<my_string.length(); i++){
            char target = my_string.charAt(i);
            if (target=='a' ||target=='e' ||target=='i' ||target=='o' ||target=='u') continue;
            sb.append(target);                
        }
        return sb.toString();
    }
}