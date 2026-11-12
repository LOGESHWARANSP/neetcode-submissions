class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        List<int[]> reslist = new ArrayList<>();
        int index=0;
        while( index < intervals.length){
            int newstart = intervals[index][0];
            int currend = intervals[index][1];
            while(index < intervals.length -1 && currend >= intervals[index +1][0]){
                currend = Math.max(currend,intervals[index + 1][1]);
                index++;
            }
            int newend = currend;
            reslist.add(new int[] {newstart,newend});
            index++;
        }
        index=0;
        int[][] res = new int[reslist.size()][2];
        for(int[] arr:reslist ){
            res[index++]=arr;
        }
        return res;
    }
}
