import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Member[] members = new Member[id_list.length];
        Map<String, Integer> memberMaps = new HashMap<>();
        Set<String> suspensionTargets = new HashSet<>(); // 정지 대상
        
        for(int i=0; i < id_list.length; i++){
            String id = id_list[i];
            Member member = new Member(id, i);
            members[i] = member;
            
            memberMaps.put(id, i); // 멤버 id를 인덱스 번호와 매핑
        }
        
        // 신고한 유저 저장
        for(int i=0; i < report.length; i++){
            String[] token = report[i].split(" ");
            String reporterId = token[0];
            String reportedId = token[1];
            
            int index = memberMaps.get(reporterId);
            members[index].report(reportedId);
        }
        
        // 신고당한 횟수 누적
        for(Member member : members){
            for(String memberId : member.getReportedMember()){
                int index = memberMaps.get(memberId);
                members[index].reported();
                
                // 신고 횟수가 특정횟수 이상이면 정지대상 (Member 클래스에서 boolean 값으로 반환후 분기 처리 가능할듯)
                if(members[index].getReportedCount() >= k){
                    suspensionTargets.add(members[index].getId());
                }
            }
        }
        
        for(String taget : suspensionTargets){
            int index = 0;
            for(Member member : members){
                if(member.isReported(taget)){
                    answer[index]++;
                }
                index++;
            }
        }
        
        return answer;
    }
}

class Member{
    String id;
    int index;
    Set<String> reportedMembers;
    int reportedCount;
    
    Member(String id, int index){
        this.id = id;
        this.index = index;
        this.reportedMembers = new HashSet<>();
        this.reportedCount = 0;
    }
    
    public boolean isReported(String id){
        return reportedMembers.contains(id);
    }
    
    public String[] getReportedMember(){
        String[] result = new String[reportedMembers.size()];
        
        int index = 0;
        for(String member : reportedMembers){
            result[index++] = member;
        }
        
        return result;
    }
    
    public void report(String id){
        reportedMembers.add(id);
    }
    
    public void reported(){
        reportedCount += 1;
    }
    
    public int getReportedCount(){
        return reportedCount;
    }
    
    public String getId(){
        return id;
    }
    
    public int getIndex(){
        return index;
    }
}