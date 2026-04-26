class Solution {
    private static final String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public String solution(String letter) {
        String[] morseSignal = letter.split(" ");
        StringBuilder message = new StringBuilder();
        
        for(String ms : morseSignal){
            int index = findIndex(ms);
            char alphabet = (char)('a' + index);
            message.append(Character.toString(alphabet));
        }
        return message.toString();
    }
    
    private int findIndex(String target){
        for(int i = 0; i < MORSE.length; i++){
            if(target.equals(MORSE[i])){
                return i;
            }
        }
        return -1;
    }
}