class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer>st=new Stack();
        int maxarea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty()&& (i==n|| heights[st.peek()]>=heights[i])){
                int height=heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;

                maxarea=Math.max(maxarea,height*width);
            }
            st.push(i);
        }
        return maxarea;
    }
}
