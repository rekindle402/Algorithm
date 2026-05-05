class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        
        if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(')
            return false;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                cnt += 1;
                answer = false;
            } else {
                cnt -= 1;
                answer = true;
            }
            if(cnt<0)
                return false;
        }
        if(cnt!=0)
            answer = false;
        
        return answer;
//         for(int i = 1; i<s.length()-1; i++){
//             if(s.charAt(i)=='('){
//                 cnt += 1;
//             } else {
//                 cnt -= 1;
//             }
//         }
            
//             System.out.println(cnt);
//             if(cnt==0)
//                 return answer;
//             else
//                answer = false;
    }
}