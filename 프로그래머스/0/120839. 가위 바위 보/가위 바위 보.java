class Solution {
    private static final char ROCK= '0';
    private static final char SCISSOR= '2';
    private static final char PAPER= '5';
    
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++){
            char c = switch(rsp.charAt(i)){
                case ROCK -> PAPER;
                case SCISSOR -> ROCK;
                case PAPER -> SCISSOR;
                default -> throw new IllegalArgumentException("Invaild rsp Value");
            };
            sb.append(c);
        }
        return sb.toString();
    }
}