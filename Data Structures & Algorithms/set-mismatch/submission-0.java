class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int dup=0;
        int miss=0;
        for(int i=0;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    dup=i;
                }
            }
            else{
                miss=i;
            }
        }
        int[] res=new int[2];
        res[0]=dup;
        res[1]=miss;
        return res;
        
    }
}