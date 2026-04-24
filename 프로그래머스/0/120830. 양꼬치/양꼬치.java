class Solution {
    private static final int FOOD_PRICE = 12000;
    private static final int DRINK_PRICE = 2000;
    public int solution(int n, int k) {
        int result = n*FOOD_PRICE + DRINK_PRICE * (k - calcFreeDrink(n));
        
        return result;
    }
    
    private int calcFreeDrink(int foodCount){
        return (foodCount/10);
    }
}