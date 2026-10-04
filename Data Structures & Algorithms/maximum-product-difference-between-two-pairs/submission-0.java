class Solution {
    public int maxProductDifference(int[] nums) {

        int big=Integer.MIN_VALUE;
        int secondbig=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>big){
                secondbig=big;
                big=num;
            }
            else{
                if(secondbig<num){
                    secondbig=num;
                }
                else{
                    secondbig=secondbig;
                }
            }
            if(small >num){
                secondsmall=small;
                small=num;
            }
            else{
                if(secondsmall>num){
                    secondsmall=num;
                }
                else{
                    secondsmall=secondsmall;
                }
            }
        }
        return (big *secondbig)-(small*secondsmall);
        
    }
}