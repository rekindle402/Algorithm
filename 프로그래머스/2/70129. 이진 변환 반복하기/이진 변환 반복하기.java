class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            int cntZeros = findZeros(s);
            s = Integer.toBinaryString(s.length()-cntZeros);
            answer[0] += 1;
            answer[1] += cntZeros;
       }
        return answer;
    }
    
    // 0의 개수를 반환
    private int findZeros(String s){
        int cntZeros = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='0') cntZeros += 1;
        }
        return cntZeros;
    }
}