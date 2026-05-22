import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {
        //우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        
        // 대기 큐(Process.priority, Process.index)
        Queue<Process> queue = new ArrayDeque<>();
        
        for(int i=0; i < priorities.length; i++){
            pq.add(priorities[i]); // 우선순위 큐
            queue.offer(new Process(priorities[i], i)); // 대기 큐 (priority, index)
        }
        
        int answer = 0; // 실행 순서
        
        while (!queue.isEmpty()) {
            // 조건1. 실행 대기 큐에서 프로세스 하나 꺼내기
            Process current = queue.poll();

            // 조건2. 대기중인 프로세스중 우선 순위 높은 프로세스가 있는지 판별
            if (current.priority < pq.peek()) {
                queue.offer(current); // 조건2. 방금 꺼냈었던 프로세스를 다시 큐에 넣기
            } else {
                pq.poll(); 
                answer++; 

                if (current.index == location) { // 꺼내었던 프로세스가 원하는 프로세스인지 판별(인덱스 비교)
                    return answer;
                }
            }
        }
        
        return answer;
    }
}

class Process {
    int priority;
    int index;
    
    Process(int priority, int index){
        this.priority = priority;
        this.index = index;
    }
}