class Solution {
    public int[] solution(int brown, int yellow) {
        int size = brown + yellow;
        
        for(int i=1; i <= size / i; i++){
            if(size % i == 0){
                int height = i;
                int width = size / i;
                
                if ((width - 2) * (height - 2) == yellow) return new int[] {width, height};
            }
        }
        
        return new int[] {};
    }
}