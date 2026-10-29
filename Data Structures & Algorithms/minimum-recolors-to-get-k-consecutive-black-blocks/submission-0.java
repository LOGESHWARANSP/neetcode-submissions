class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=blocks.length()+1;
        int left=0;
        int whitecount=0;
        for(int right=0;right<blocks.length();right++){
            if(blocks.charAt(right)=='W'){
                whitecount++;
            }
            if(right -left +1==k){
                res=Math.min(res,whitecount);
                if(blocks.charAt(left)=='W'){
                    whitecount--;
                }
                left++;
            }
        }
        return res;
        
    }
}