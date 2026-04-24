class Solution {
    private static final int FOOD_PRICE = 12000;
    private static final int DRINK_PRICE = 2000;
    public int solution(int n, int k) {
        int result = 0;
        result = (n*FOOD_PRICE) + (k*DRINK_PRICE) - calcDiscount(n);
        
        return result;
    }
    
    public int calcDiscount(int foodCount){
        return (foodCount/10)*DRINK_PRICE;
    }
}