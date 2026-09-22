class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int count=0;
        for(int n:nums){
            if(n==0){
                res=Math.max(res,count);
                count=0;
            }
            else{
                count++;
            }
        }
        return Math.max(res,count);

    }
}