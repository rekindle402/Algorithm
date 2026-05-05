class Solution {
    private static final int ID = 0;
    private static final int PASSWORD = 1;
    public String solution(String[] id_pw, String[][] db) {
        String requestId = id_pw[0];
        String requestPw = id_pw[1];
        
        for(String[] data : db){
            if(requestId.equals(data[ID]) && requestPw.equals(data[PASSWORD])){
                return "login";
            } else if(requestId.equals(data[ID]) && !requestPw.equals(data[PASSWORD])){
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}
