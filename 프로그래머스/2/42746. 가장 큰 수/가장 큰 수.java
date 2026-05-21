import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        // Comparator 사용을 위한 문자열[]
        String[] strNumbers = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // Comparator 정렬
        Arrays.sort(strNumbers, (a, b) -> {
            return (b+a).compareTo(a+b);
        });
        
        if (strNumbers[0].equals("0")) return "0";

        return String.join("", strNumbers);
    }
}



