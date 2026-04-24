import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int maxIndex = numbers.length-1;
        
        return numbers[maxIndex] * numbers[maxIndex-1];
    }
}