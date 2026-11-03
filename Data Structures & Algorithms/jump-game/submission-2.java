class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null || nums.length==0){
            return false;
        }
        int steps=nums[0];

        for(int i=0;i<nums.length;i++){
           
            if(steps < 0){
                return false;
            }
            if(i== nums.length-1){
                return true;
            }
            if(steps < nums[i]){
                steps=nums[i];
            }
             steps--;
        }
        return true;
        
    }
}
