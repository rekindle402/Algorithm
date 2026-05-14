class Solution {
    public int solution(String t, String p) {
        int count = 0;
        long std = Long.parseLong(p);
        
        for(int i=0; i <= t.length() - p.length(); i++){
            String s = t.substring(i, i + p.length());
            long num = Long.parseLong(s);
            if(num <= std) count++;
        }
        
        return count;
    }
}