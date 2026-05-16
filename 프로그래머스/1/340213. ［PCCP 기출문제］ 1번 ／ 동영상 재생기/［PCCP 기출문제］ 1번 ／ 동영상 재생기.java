class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands){
        
        int startOpening = toSec(op_start);
        int endOpening = toSec(op_end);
            
        if(isOpening(startOpening, endOpening, pos)) pos = toPos(endOpening); // 오프닝 스킵
        
        for(String command : commands){
            pos = switch(command){
                case "next" -> next(pos, video_len);
                case "prev" -> prev(pos);
                default -> "00:00";
            };
            if(isOpening(startOpening, endOpening, pos)) pos = toPos(endOpening); // 오프닝 스킵
        }
        
        return pos;
    }
    
    // 오프닝 스킵
    private boolean isOpening(int opStart,int opEnd, String pos){
            int currentTime = toSec(pos);
            
            return opStart <= currentTime && currentTime <= opEnd;
    }
        
    // 10초 뒤로 이동
    private String next(String pos, String video_len){
        final int NEXT_TIME = 10;
        
        int nextSec = toSec(pos) + NEXT_TIME;
        int endSec = toSec(video_len);
        
        return nextSec >= endSec ? video_len : toPos(nextSec);
    }
    
    // 10초 전으로 이동
    private String prev(String pos){
        final int PREV_TIME = 10;
        final int START_SEC = 0;
        
        int prevSec = toSec(pos) - PREV_TIME;
        
        return prevSec <= START_SEC ? "00:00" : toPos(prevSec);
    }
    
    // mm:ss 형식을 초(sec)로 변환
    private int toSec(String pos){
        String[] time = pos.split(":");
        
        int sec = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        
        return sec;
    }
    
    // 초(sec)를 mm:ss 형식으로 변환
    private String toPos(int sec){
        int minute = sec / 60;
        String posMinute = "";
        
        int remainSec = sec % 60;
        String posSec = "";
        
        // mm 형식으로 파싱
        if(minute < 10){
             posMinute = "0" + String.valueOf(minute);
        } else {
            posMinute = String.valueOf(minute);
        }
        
        // ss 형식으로 파싱
        if(remainSec < 10){
            posSec = "0" + String.valueOf(remainSec);
        } else {
            posSec = String.valueOf(remainSec);
        }
        
        return posMinute + ":" + posSec;
    }
}