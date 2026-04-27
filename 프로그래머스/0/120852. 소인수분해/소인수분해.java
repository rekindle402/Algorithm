import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) {
                factors.add(divisor);

                while (n % divisor == 0) {
                    n /= divisor;
                }
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return convertToArray(factors);
    }

    private int[] convertToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}