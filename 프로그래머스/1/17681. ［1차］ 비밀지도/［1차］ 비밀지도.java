class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            String decryptMaps = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            for(char c : decryptMaps.toCharArray()){
                sb.append(c == '1' ? "#" : " ");
             }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}