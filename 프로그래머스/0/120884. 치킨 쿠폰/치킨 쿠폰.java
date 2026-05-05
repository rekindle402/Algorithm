class Solution {
    public int solution(int chicken) {
        int remainingCoupon = chicken;
        int serviceChicken = 0;
        while(remainingCoupon >= 10){
            serviceChicken += remainingCoupon/10;
            remainingCoupon = remainingCoupon/10 + remainingCoupon%10;
        }
        return serviceChicken;
    }
}