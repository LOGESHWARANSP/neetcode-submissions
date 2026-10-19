class Solution {
    public long countBadPairs(int[] nums) {
        long good=0;
        long total=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i]-i;
            total+=i;
            if(map.containsKey(key)){
                good+=map.get(key);
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }

        return total-good;

    }
}
