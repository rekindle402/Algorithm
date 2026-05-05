class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        int currentDistance = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int num = array[i];
            int distance = Math.abs(num - n);

            if (distance < currentDistance || distance == currentDistance && num < result) {
                result = num;
                currentDistance = distance;
            }
        }

        return result;
    }
}