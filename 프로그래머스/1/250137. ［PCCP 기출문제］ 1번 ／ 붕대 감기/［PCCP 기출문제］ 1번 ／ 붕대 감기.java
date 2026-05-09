class Solution {
    private static final int CASTING = 0;
    private static final int HEAL_PER_SEC = 1;
    private static final int BONUS_HEAL = 2;
    
    private static final int ATTACK_TIME = 0;
    private static final int DAMAGE = 1;
    
    public int solution(int[] bandage, int health, int[][] attacks) {
        final int MAX_HEALTH = health;
        
        int attackIdx = 0;
        int successCnt = 0;
        int lastAttackTime = attacks[attacks.length-1][ATTACK_TIME];
        
        for(int sec = 1; sec <= lastAttackTime; sec++){
            if(sec == attacks[attackIdx][ATTACK_TIME]){
                health -= attacks[attackIdx][DAMAGE];
                attackIdx++;
                successCnt = 0;
                if(health <= 0) return -1;
            } else {
                health = heal(health, bandage[HEAL_PER_SEC], MAX_HEALTH);
                successCnt++;
                if(successCnt == bandage[CASTING]){
                    health = heal(health, bandage[BONUS_HEAL], MAX_HEALTH);
                    successCnt = 0;
                }
            }
        }
        
        return health;
    }
    
    private int heal(int currentHealth, int healValue, int maxHp){
        int healedHp = currentHealth + healValue;
        return healedHp < maxHp ? healedHp : maxHp;
    }
}