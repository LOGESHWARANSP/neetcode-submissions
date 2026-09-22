class Solution {
    public int countSeniors(String[] details) {

        int res=0;
        for(String d:details){
        int one=d.charAt(11)-'0';
        int two=d.charAt(12)-'0';
        int age=one*10+two;
        if(age>60){
            res++;
        }
        }
        return res;
        
    }
}