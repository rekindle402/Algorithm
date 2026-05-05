class Solution {
    private static final int PIECE = 7;
    public int solution(int n) {
        int qty = 1;
        while(true){
            if(PIECE*qty / n > 0) break;
            qty++;
        }
        return qty;
    }
}