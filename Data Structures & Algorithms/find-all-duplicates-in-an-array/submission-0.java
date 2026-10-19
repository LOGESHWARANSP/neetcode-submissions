class Solution {
    public int[] findDuplicates(int[] nums) {

        List<Integer> list= new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                list.add(num);
            }
            else{
                map.put(num,1);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
