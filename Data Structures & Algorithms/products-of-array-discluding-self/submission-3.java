class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod=1;
        int zerocount=0;
        for(int n:nums){
            if(n!=0){
                prod*=n;
            }
            else{
                zerocount++;
            }
        }
        if(zerocount>1)
        return new int[nums.length];
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zerocount>0){
                if(nums[i]==0){
                    res[i]=prod;
                }
                else res[i]=0;
            }
            else
            res[i]=prod/nums[i];
        }
        return res;

        
    }
}  
