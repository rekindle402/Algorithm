class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(n, m);
        answer[0] = gcd;
        answer[1] = gcd == 1 ? n * m : m/gcd * n;
        
        return answer;
    }
    
    private int gcd(int a, int b){
        while(b != 0){
            int tmp = a % b ;
            a = b;
            b = tmp;
        }
        return a;
    }
}