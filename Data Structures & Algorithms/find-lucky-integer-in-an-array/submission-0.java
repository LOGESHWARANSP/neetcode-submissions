class Solution {
    public int findLucky(int[] arr) {
        int res=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int num:map.keySet()){
            if(num==map.get(num)){
                res=Math.max(res,num);
            }
        }
        return res;
        
    }
}