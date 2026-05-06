class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] polynomials = polynomial.split(" ");
        
        int variable = 0;
        int constant = 0;
        
        for(int i=0; i<polynomials.length; i+=2){
            String term = polynomials[i];
            if(term.equals("x")){
                variable += 1;
            } else if(term.contains("x")){
                variable += Integer.parseInt(term.replace("x",""));
            } else {
                constant += Integer.parseInt(term);
            }
        }
        
        if(variable > 1){
            answer += variable + "x";
        } else if(variable == 1){
            answer += "x";
        }
        
        if(constant > 0 && answer.contains("x")){
            answer += " + " + constant;
        } else if(constant > 0){
            answer += constant;
        }
        
        
        return answer;
    }
}