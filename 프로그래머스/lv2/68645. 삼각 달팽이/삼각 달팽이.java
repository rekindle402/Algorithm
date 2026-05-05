class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    public int[] solution(int n) {
        // 2차원 배열 생성
        int[][] triangle = new int[n][n];
        int v = 1;
        
        // 최초 좌표 지정
        int x = 0;
        int y = 0;
        int d = 0;
        
        // 반복하여 숫자 채우기
        while(true){
            // 아래로 이동
            triangle[y][x] = v++;
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0){
                d = (d+1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break;
            }
            x = nx;
            y = ny;
        }
        
        // 출력 양식으로 변환
        int[] result = new int[v-1];
        int index = 0;
        for (int i=0; i<n; i++){
            for(int j = 0; j<=i; j++){
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }
}