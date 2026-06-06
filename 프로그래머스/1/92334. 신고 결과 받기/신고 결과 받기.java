import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
class Solution {
    Map<String, Integer> memberIndex = new HashMap<>();
    Set<String> suspensionTargets = new HashSet<>();
    
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Member[] members = new Member[id_list.length]; 
        
        initMembers(id_list, members); 
        saveReports(report, members);  
        countReports(members, k);
        
        for(String target : suspensionTargets){
            for(Member member : members){
                if(member.isReported(target)){ 
                    answer[member.getIndex()]++; 
                }
            }
        }
        return answer;
    }
    
    private void initMembers(String[] id_list, Member[] members){
        for(int i=0; i < id_list.length; i++){
            String id = id_list[i];
            members[i] = new Member(id, i);
            memberIndex.put(id, i);
        }
    }
    
    private void saveReports(String[] report, Member[] members){
        for(int i=0; i < report.length; i++){
            String[] token = report[i].split(" ");
            String reporterId = token[0];
            String reportedId = token[1];
            
            int index = memberIndex.get(reporterId);
            members[index].report(reportedId);
        }
    }
    
    private void countReports(Member[] members, int k){
        for(Member member : members){
            for(String memberId : member.getReportedMember()){
                int index = memberIndex.get(memberId);
                Member reportedMember = members[index];
                if(reportedMember.reported(k)){
                    suspensionTargets.add(reportedMember.getId());
                }
            }
        }
    }
}
class Member{
    String id;
    int index; // members 배열에서의 위치, answer 배열 인덱스와 대응
    Set<String> reportedMembers; // 중복 신고 방지를 위해 Set 사용
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
    
    public void report(String id){
        reportedMembers.add(id);
    }
    
    // k번 이상 신고되면 true 반환
    public boolean reported(int k){
        reportedCount += 1;
        return reportedCount >= k;
    }
    
    public String getId(){
        return id;
    }
    
    public int getIndex(){
        return index;
    }
    
    public Set<String> getReportedMember(){
        return reportedMembers;
    }
    
    public int getReportedCount(){
        return reportedCount;
    }
}