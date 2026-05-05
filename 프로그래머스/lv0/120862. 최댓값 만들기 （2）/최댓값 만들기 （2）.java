import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        int minProduct = numbers[0]*numbers[1];
        int maxProduct = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        return Math.max(minProduct, maxProduct);
    }
}