class Solution {
    private final static String[] PRONUNCIATIONS = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<babbling.length; i++){
            sb.append(babbling[i]);
            // 주어진 단어에서 발음 가능한 단어 제거
            for(int j=0; j<PRONUNCIATIONS.length; j++){
                int start = sb.indexOf(PRONUNCIATIONS[j]);
                if(start != -1){
                    int end = PRONUNCIATIONS[j].length();
                    sb.replace(start, start+end," ");
                }
            }
            // 공백 제거
            while(sb.indexOf(" ") != -1){
                int index = sb.indexOf(" ");
                sb.delete(index, index+1);
            }
            
            // 발음할수 있는 단어인지 검증
            if(sb.length() == 0){
                answer++;
            }
            
            sb.setLength(0);
        }
        
        return answer;
    }
}