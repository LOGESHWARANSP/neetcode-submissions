class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }
            else if(c==')' && count > 0){
                count--;
            }
            else if(c==')'){
                arr[i]='\0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length -1;i>=0;i--){
            char c=arr[i];
            if(c=='(' && count > 0){
                count--;
            }
            else if(c!='\0'){
                sb.append(c);
            }
        }
        return sb.reverse().toString();
        
    }
}