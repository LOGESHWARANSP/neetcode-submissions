class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        String digits="123456789";
        int lowlength=String.valueOf(low).length();
        int highlength= String.valueOf(high).length();
        for(int left=lowlength;left<=highlength;left++){
            for(int right=0;right<=digits.length()-left;right++){
                String seqstring=digits.substring(right,right + left);
                int num=Integer.parseInt(seqstring);
                if(num >=low && num<=high){
                    res.add(num);
                }
            }
        }
        return res;
        
    }
}