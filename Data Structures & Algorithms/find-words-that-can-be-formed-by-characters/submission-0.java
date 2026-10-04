class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character,Integer>map=new HashMap<>();
       
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int ans=0;
        for(String s:words){
             Map<Character,Integer>temp=new HashMap<>();
            boolean checks=true;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(temp.containsKey(ch)){
                    temp.put(ch,temp.get(ch)+1);
                }
                else{
                    temp.put(ch,1);
                }
                 if(!map.containsKey(ch)||temp.get(ch)>map.get(ch)){
                    checks=false;
                    break;
                 }
            }
            if(checks){
                ans+=s.length();
            }
           
        }

        return ans;
    }
}