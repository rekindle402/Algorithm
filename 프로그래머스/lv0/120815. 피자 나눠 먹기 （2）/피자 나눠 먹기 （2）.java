class Solution {
    private static final int SLICE = 6;
    public int solution(int n) {
        int qty = 1;
        while(true){
            if((SLICE*qty) % n == 0) break;
            qty++;
        }
        return qty;
    }
}