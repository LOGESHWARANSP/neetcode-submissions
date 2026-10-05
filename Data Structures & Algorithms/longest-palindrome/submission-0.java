class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>set=new HashSet<>();
        int res=0;
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                res+=2;
         }
         else{
            set.add(c);
         }
        }
        return set.isEmpty() ? res:res+1;
        
    }
}