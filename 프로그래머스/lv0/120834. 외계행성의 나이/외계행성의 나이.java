import java.util.Stack;

class Solution {
    public String solution(int age) {
        Stack<Integer> stackInt = new Stack<>();
        String answer = "";
        
        while(age>0){
            stackInt.push(age%10);
            age /= 10;
        }
        
        while(!stackInt.empty()){
            answer += Character.toString(stackInt.pop() + 'a');
        }
        return answer;
    }
}