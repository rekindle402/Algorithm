import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        if(cacheSize == 0) return cities.length * 5;
        
        for(String city : cities){
            city = city.toLowerCase();
            if(cache.contains(city)){ // hit
                cache.remove(city);
                cache.addLast(city);
                answer += 1;
            } else { // miss
                if(cache.size() >= cacheSize){
                    cache.removeFirst();
                }
                cache.addLast(city);
                answer += 5;
            }
        }
        return answer;
    }
}

