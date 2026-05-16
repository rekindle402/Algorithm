class Solution {
    public int solution(int n, int w, int num) {
        // 목표 상자의 행, 열
        int targetY = (num + w - 1) / w;
        int targetX = (num - 1) % w + 1;
        
        // 마지막 상자의 행, 열
        int maxY = (n + w - 1) / w;
        int maxX = (n - 1) % w + 1;
        
        // 목표 상자의 행이 짝수일경우 열 위치 반전
        if(targetY % 2 == 0) targetX = w - targetX + 1;
        
        // 마지막 열 상자 미포함
        int result = maxY - targetY;

        if(maxY % 2 == 0) {
            maxX = w - maxX + 1; // 열 위치 반전
            if(targetX >= maxX) result++; // 마지막 열의 상자를 포함
        } else { // 열 위치 반전 없이 수행
            if(targetX <= maxX) result++;
        }
        
        return result;
        
    }
}