class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        
        int count = 0;
        int maxCount = A.length();
        
        while(count < maxCount){
            System.out.println(sb.toString());
            if(sb.toString().equals(B)) return count;
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
            count++;
        }
        
        return -1;
    }
}