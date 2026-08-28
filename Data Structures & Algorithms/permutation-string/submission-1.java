class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer>need=new HashMap<>();
        Map<Character,Integer>have=new HashMap<>();

        for(char c:s1.toCharArray()){
            if(!need.containsKey(c)){
                need.put(c,0);
            }
            else{
                need.put(c,need.get(c)+1);
            }
        }
        int start=0;
        int end=0;
        while(end<s2.length()){
            char c=s2.charAt(end);
            if(!need.containsKey(c)){
                end+=1;
                start=end;
                have.clear();
                continue;
            }
            if(!have.containsKey(c)){ have.put(c,0);}
            else{
            have.put(c,have.get(c)+1);
            }
            while(have.get(c)>need.get(c)){
                char ch=s2.charAt(start);
                have.put(ch,have.get(ch)-1);
                start+=1;
            }
            int size=end-start+1;
            if(size==s1.length()){
                return true;
            }
            end+=1;


        }
        return false;
        
    }
}
