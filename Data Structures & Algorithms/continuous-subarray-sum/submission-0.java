class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
            int r= tot % k;
            if(!map.containsKey(r)){
                map.put(r,i);
            }
            else if(i-map.get(r)>1){
                return true;
            }
        }
        return false;
        
    }
}