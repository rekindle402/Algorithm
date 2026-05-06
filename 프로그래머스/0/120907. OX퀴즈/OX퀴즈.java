class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String q = quiz[i];
            answer[i] = isTrue(q) ? "O" : "X";
        }
        
        return answer;
    }
    
    private boolean isTrue(String quiz){
        boolean result = false;
        String[] tokens = quiz.split(" ");
        
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[2]);
        int z = Integer.parseInt(tokens[4]);
        String operator = tokens[1];

        if(operator.equals("+")){
            result = x + y == z ? true : false;
        } else {
            result = x - y == z ? true : false;
        }
        
        return result;
    }
}