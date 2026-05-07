class Solution {
    public int solution(int[][] dots) {
        // 4C2 = 6(조합)
        double[] slope = new double[6];
        
        // 전체 기울기 구하기.
        int index = 0;
        for(int i=0; i<dots.length-1; i++){
            int x1 = dots[i][0];
            int y1 = dots[i][1];
            for(int j=i+1; j<dots.length; j++){
                int x2 = dots[j][0];
                int y2 = dots[j][1];
                System.out.println((double) (y2-y1) / (x2-x1));
                slope[index++] = (double) (y2-y1) / (x2-x1);
            }
        }
        
        if(slope[0] == slope[5]) return 1;
        if(slope[1] == slope[4]) return 1;
        if(slope[2] == slope[3]) return 1;
        
        return 0;
    }
}