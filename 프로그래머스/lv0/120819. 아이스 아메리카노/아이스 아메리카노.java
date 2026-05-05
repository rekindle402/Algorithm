class Solution {
    private static final int PRICE = 5500;
    public int[] solution(int money) {
        int cupCount = money / PRICE;
        int remainingMoney = money % PRICE;
        return new int[] {cupCount, remainingMoney};
    }
}