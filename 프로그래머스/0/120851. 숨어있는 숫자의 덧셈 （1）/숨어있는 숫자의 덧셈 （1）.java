class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
                sum += c-'0';
            }
        }
        return sum;
    }
}