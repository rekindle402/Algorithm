class Solution {
    public int solution(int num, int k) {
        String numString = String.valueOf(num);
        String target = String.valueOf(k);
        
        int index = numString.indexOf(target);
        
        return index == -1 ? -1 : index + 1;
    }
}