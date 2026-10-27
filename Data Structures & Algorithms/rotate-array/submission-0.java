class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || nums==null || k==nums.length)
        {
            return;
        }
        if( k > nums.length){
            k=k % nums.length;
        }
        int left=0;
        int right=nums.length-1-k;
        int nextleft=right+1;
        while(left < right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        right=nums.length-1;
        while(nextleft < right){
            int temp=nums[nextleft];
            nums[nextleft]=nums[right];
            nums[right]=temp;
            nextleft++;
            right--;
        }
        left=0;
        right=nums.length-1;
        while(left < right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}