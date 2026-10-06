class Solution {
    public int specialArray(int[] nums) {
        int[] count=new int[nums.length+1];
        int n=nums.length;
        for(int num:nums){
            if(num >= n){
                count[n]++;
            }
            else{
                count[num]++;
            }
        }
        int greater=0;
        for(int i=n;i>=1;i--){
            greater=greater+count[i];
            if(greater==i){
                return greater;
            }
        }
        return -1;
    }
}