class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        int dev=0;
        for(int i=0;i<len;i++){
            if(i<len-1 && nums[i] > nums[i+1]){
                dev++;
            }
            else if(i==len-1 && nums[len-1] > nums[0]){
                dev++;
            }
        }
        return (dev >1)?false:true;
        
    }
}