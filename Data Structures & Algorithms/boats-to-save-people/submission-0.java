class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left=0;
        int right=people.length-1;
        int boatused=0;
        Arrays.sort(people);
        while(left <= right){
            boatused++;
            if(people[left]+people[right]<= limit){
                left+=1;
            }
            right-=1;
        }
        return boatused;
        
    }
}