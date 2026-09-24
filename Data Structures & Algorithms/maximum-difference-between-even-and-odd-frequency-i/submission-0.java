class Solution {
    public int maxDifference(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
        
       for(char ch:s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
       } 
       int maxodd=Integer.MIN_VALUE;
       int mineven=Integer.MAX_VALUE;
       for(int freq:map.values()){
        if(freq%2==1){
            maxodd=Math.max(maxodd,freq);
        }
        else{
            mineven=Math.min(mineven,freq);
        }
       }
       return maxodd-mineven;
    }
}