class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        for(int i:nums){
            set.remove(i);
        }
        return new ArrayList<>(set);
    }
}