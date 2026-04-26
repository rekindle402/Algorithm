class Solution {
    public int solution(String my_string) {
        int result = 0;
        int tmp = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                tmp = tmp * 10 + (c - '0');
            } else {
                result += tmp;
                tmp = 0;
            }
        }

        return result + tmp;
    }
}