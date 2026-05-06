class Solution {
    public int solution(int a, int b) {
        // 분자와 분모의 최대공약수로 약분 -> 기약 분수
        // 최대 공약수 (유클리드 호제법)
        int answer = 0;
        b /= getGcd(a, b);
        
        while(b % 2 == 0){
            b /= 2;
        }
        
        while(b % 5 == 0){
            b /= 5;
        }
        
        return b == 1 ? 1 : 2;
    }
    
    private int getGcd(int a, int b){
        while(b!=0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}