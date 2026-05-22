import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        
        // 작업 완료 일수 계산
        for(int i=0; i<progresses.length; i++){
            int remainRate = 100 - progresses[i];
            int completeDays = (remainRate + speeds[i] - 1) / speeds[i];
            System.out.print(completeDays + " ");
            queue.offer(completeDays);
        }
        System.out.println();
        
        int releaseDate = queue.poll(); // 이전 작업 배포 일
        int count = 1; // 배포된 작업 개수
        
        // 함께 배포되는 작업 개수 계산
        while(!queue.isEmpty()){
            if(releaseDate >= queue.peek()){
                System.out.println(releaseDate + " >= " + queue.peek() + " = " + "true");
                count++;
                queue.poll();
            } else {
                System.out.println(releaseDate + " >= " + queue.peek() + " = " + "false");
                list.add(count);
                count = 1;
                releaseDate = queue.poll();
            }
        }
        
        list.add(count);
        
        return toIntArray(list);
    }
    
    private int[] toIntArray(List<Integer> list){
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}