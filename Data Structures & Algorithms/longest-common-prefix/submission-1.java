class Solution {
    public String longestCommonPrefix(String[] strs) {
        int curr=0;
        String res="";
        if(strs.length==1){
            return strs[0];
        }
        while(true){
        for(int i=0;i<strs.length-1;i++){
            if(curr>=strs[i].length()|| curr>=strs[i+1].length()||strs[i].charAt(curr)!=strs[i+1].charAt(curr)){
                return res;
            }
        }
            res=res+strs[0].charAt(curr);
            curr+=1;
        
    }
        
    }
}