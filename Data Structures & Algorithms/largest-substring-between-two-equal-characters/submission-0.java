class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                int left=map.get(s.charAt(right));
                max=Math.max(max,right-left-1);
            }
            else{
                map.put(ch,right);
            }
        }
        return max;
        
    }
}