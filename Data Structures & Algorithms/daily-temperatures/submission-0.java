class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer>st=new Stack();
        int[] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(st.size()==0 || temperatures[st.peek()]>=temperatures[i]){
                st.push(i);
            }
            else{
                while(st.size()>0 &&temperatures[st.peek()]<temperatures[i]){
                    int last=st.pop();
                    res[last]=i-last;
                }
                st.push(i);
            }
        }
        return res;
    }
}
