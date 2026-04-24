class Solution {
    private static final int DISCOUNT_RATE_5_PERCENT =95;
    private static final int DISCOUNT_RATE_10_PERCENT = 90;
    private static final int DISCOUNT_RATE_20_PERCENT = 80;
    
    private static final int MIN_PRICE_FOR_20_PERCENT_DISCOUNT = 500_000;
    private static final int MIN_PRICE_FOR_10_PERCENT_DISCOUNT = 300_000;
    private static final int MIN_PRICE_FOR_5_PERCENT_DISCOUNT = 100_000;

    
    public int solution(int price) {
        return price - discountPrice(price);
    }
    
    private int discountPrice(int price){
        if(price >= MIN_PRICE_FOR_20_PERCENT_DISCOUNT){
            return price - price * DISCOUNT_RATE_20_PERCENT / 100;
        } else if(price >= MIN_PRICE_FOR_10_PERCENT_DISCOUNT){
            return price - price * DISCOUNT_RATE_10_PERCENT / 100;
        } else if (price >= MIN_PRICE_FOR_5_PERCENT_DISCOUNT){
            return price - price * DISCOUNT_RATE_5_PERCENT / 100;
        }
        return 0;
    }
}