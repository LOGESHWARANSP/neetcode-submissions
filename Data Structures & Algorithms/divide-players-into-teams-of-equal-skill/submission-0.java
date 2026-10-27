class Solution {
    public long dividePlayers(int[] skill) {
        Map<Integer,Integer> map =new HashMap<>();
        int total=0;
        for(int i=0;i< skill.length;i++){
            total+=skill[i];
            if(map.containsKey(skill[i])){
                map.put(skill[i],map.get(skill[i])+1);
            }
            else{
                map.put(skill[i],1);
            }
        }
        int team=total /(skill.length/2);
        long ans=0;
        for(int i=0;i<skill.length;i++){
            if(map.get(skill[i])>0){
                map.put(skill[i],map.get(skill[i])-1);
                int rem=team-skill[i];
                if(!map.containsKey(rem) || map.get(rem)<=0){
                    return -1;
                }
                map.put(rem,map.get(rem)-1);
                ans+=skill[i]* rem;
            }
        }
        return ans;

    }
}
