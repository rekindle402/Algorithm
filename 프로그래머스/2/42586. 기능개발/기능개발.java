import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>(); // 기능 완성일을 담는 큐
        List<Integer> list = new ArrayList<>(); // 결과 반환용 List
        
        // 기능 완성일 계산
        for(int i=0; i<progresses.length; i++){
            int remainRate = 100 - progresses[i];
            int completeDays = (remainRate + speeds[i] - 1) / speeds[i];
            queue.offer(completeDays);
        }
        
        int releaseDate = queue.poll(); // 최 우선 기능 배포 일
        int count = 1; // 배포된 기능의 개수
        
        // 배포되는 기능의 개수 계산
        while(!queue.isEmpty()){
            if(releaseDate >= queue.peek()){
                count++;
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                releaseDate = queue.poll();
            }
        }
        list.add(count);
        
        
        return toIntArray(list);
    }
    
    // Convert List to Array
    private int[] toIntArray(List<Integer> list){
        int[] answer = new int[list.size()];
                               
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
                               
        return answer;
    }
}