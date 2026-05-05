class Solution {
    public int solution(int chicken) {
        int remainingCoupon = chicken;
        int serviceChicken = 0;
        while(remainingCoupon >= 10){
            System.out.println("전체 쿠폰 : " + remainingCoupon);
            serviceChicken += remainingCoupon/10;
            System.out.println("치킨 누적 : " + serviceChicken);
            remainingCoupon = remainingCoupon/10 + remainingCoupon%10;
            System.out.println("잔여 쿠폰 : " + remainingCoupon);
            
            System.out.println("-- 회차 종료 --");
        }
        return serviceChicken;
    }
}