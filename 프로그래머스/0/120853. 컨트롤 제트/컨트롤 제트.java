import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (String token : s.split(" ")) {
            if (token.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        int result = 0;
        while (!stack.empty()) {
            result += stack.pop();
        }

        return result;
    }
}