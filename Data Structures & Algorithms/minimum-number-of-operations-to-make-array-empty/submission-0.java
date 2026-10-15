class Solution {
    public int minOperations(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val ==1){
                return -1;
            }
            if(val % 3 ==0){
                count+=val /3;
            }
          else if(val % 3== 1 || val % 3==2){
                count+=val /3+1;
            }
            else if( val % 2 ==0){
                count+=val /2;
            }
            else{
                return -1;
            }
        }
        return count;
    }
}